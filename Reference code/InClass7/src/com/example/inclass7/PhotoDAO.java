package com.example.inclass7;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class PhotoDAO {
	private SQLiteDatabase db;
	
	public PhotoDAO(SQLiteDatabase db){
		this.db = db;
	}
	public long save(Photo photo){
		ContentValues values = new ContentValues();
		values.put(PhotoTable.COLUMN_TITLE, photo.getTitle());
		values.put(PhotoTable.COLUMN_URL, photo.getUrl());
		values.put(PhotoTable.COLUMN_OWNER, photo.getOwner_name());
		values.put(PhotoTable.COLUMN_ID, photo.get_id());
		
		return db.insert(PhotoTable.TABLENAME, null, values);	
	}
	public boolean update(Photo photo){
		ContentValues values = new ContentValues();
		values.put(PhotoTable.COLUMN_TITLE, photo.getTitle());
		values.put(PhotoTable.COLUMN_URL, photo.getUrl());
		values.put(PhotoTable.COLUMN_OWNER, photo.getOwner_name());
		
		return db.update(PhotoTable.TABLENAME, values, PhotoTable.COLUMN_ID + "=?", new String[]{photo.get_id()+""}) > 0;
		
	}
	public boolean delete(Photo photo){
		return db.delete(PhotoTable.TABLENAME, PhotoTable.COLUMN_ID +"=?", new String[]{photo.get_id()+""})>0; 
		
	}
	public Photo getPhoto(long id){
		Photo photo = null;
		String[] columns = new String[]{PhotoTable.COLUMN_ID,PhotoTable.COLUMN_OWNER,PhotoTable.COLUMN_TITLE,PhotoTable.COLUMN_URL};
		
		
		Cursor c = db.query(true,PhotoTable.TABLENAME,columns,PhotoTable.COLUMN_ID + "=?", new String[]{id+""}, null, null, null, null, null);
		
		if(c!= null && c.moveToFirst()){
			photo = buildPhoto(c);
			if(!c.isClosed()){
				c.close();
			}
		}
		return photo;
	}
	private Photo buildPhoto(Cursor c){
		Photo photo = null;
		if(c!=null){
			photo = new Photo();
			photo.set_id(c.getLong(0));
			photo.setOwner_name(c.getString(1));
			photo.setTitle(c.getString(2));
			photo.setUrl(c.getString(3));
		}
		return photo;
		
	}
	public List<Photo> getAll(){
		List<Photo> photos = new ArrayList<Photo>();
		String[] columns = new String[]{PhotoTable.COLUMN_ID,PhotoTable.COLUMN_OWNER,PhotoTable.COLUMN_TITLE,PhotoTable.COLUMN_URL};
		Cursor c = db.query(true,PhotoTable.TABLENAME,columns,null,null, null, null, null, null, null);
		
		if(c!= null && c.moveToFirst()){
			do{
				Photo photo = buildPhoto(c);
				if(photo != null){
					photos.add(photo);
				}
			}while(c.moveToNext());
			if(!c.isClosed()){
				c.close();
			}
		}
		return photos;
	}
}
