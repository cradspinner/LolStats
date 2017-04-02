package com.example.inclass7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseOpenHelper extends SQLiteOpenHelper {

	static final String DB_NAME = "favoritePhotos.db";
	static final int DB_VERSION = 1;
	public DatabaseOpenHelper(Context context) {
		super(context,DB_NAME, null, DB_VERSION);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		PhotoTable.onCreate(db);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		PhotoTable.onUpdate(db, oldVersion, newVersion);
	}

}
