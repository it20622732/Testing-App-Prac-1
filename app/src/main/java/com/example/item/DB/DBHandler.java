package com.example.item.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {


    public DBHandler(Context context) {
        super(context, "database.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create tables in the database
        // category table
        db.execSQL("create table Category(ID INTEGER PRIMARY KEY AUTOINCREMENT, name text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public boolean addCategory(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        //inserting part
        long res = db.insert("category", null, contentValues);

        if (res == -1) {
            return false;
        } else {
            return true;
        }
    }


}

