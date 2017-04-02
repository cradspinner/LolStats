package com.example.inclass7;

import java.util.List;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DataManager {

	private Context context;
	private DatabaseOpenHelper dbOpenHelper;
	private SQLiteDatabase db;
	private PhotoDAO photoDao;
	
	public DataManager(Context context) {
		Log.d("test","maybe");
		this.context = context;
		Log.d("test","yes");
		dbOpenHelper = new DatabaseOpenHelper(this.context);
		db = dbOpenHelper.getWritableDatabase();
		photoDao = new PhotoDAO(db);
	}
	public long save(Photo photo){
		return this.photoDao.save(photo);
	}
	public boolean delete(Photo photo){
		return this.photoDao.delete(photo);
	}
	public List<Photo> getAll(){
		return this.photoDao.getAll();
	}
	public void close(){
		if(db!= null){
			db.close();
		}
	}
}
