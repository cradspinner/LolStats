package com.example.inclass7;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class PhotoTable {
	
	static final String TABLENAME = "Photos";
	static final String COLUMN_ID = "_id";
	static final String COLUMN_TITLE = "title";
	static final String COLUMN_URL = "imageURL";
	static final String COLUMN_OWNER = "owner";
	
	static public void onCreate(SQLiteDatabase db){
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE " + TABLENAME + " (");
		sb.append(COLUMN_ID + " integer primary key, ");
		sb.append(COLUMN_TITLE + " text not null, ");
		sb.append(COLUMN_URL + " text not null, ");
		sb.append(COLUMN_OWNER + " text not null);");
		
		try{
			db.execSQL(sb.toString());
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}
	static public void onUpdate( SQLiteDatabase db, int oldVersion, int newVersion){
		db.execSQL("DROP TABLE IF EXISTS " + TABLENAME);
		PhotoTable.onCreate(db);
	}
}
