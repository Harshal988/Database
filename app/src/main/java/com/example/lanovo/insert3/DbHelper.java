package com.example.lanovo.insert3;


import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.jar.Attributes;


    public class DbHelper extends SQLiteOpenHelper{

    private static final String Database_name="insertdb";
    private static final String table_name="insertbl";
    private static final String UID = "id";
    private static final String col_Name = "Name";
    private static final String col_add = "add";

    public DbHelper(Context _context){

        super(_context,Database_name,null,1);
    }

    public void onCreate(SQLiteDatabase db){
       db.execSQL("CREATE TABLE"+table_name
                +"("+UID+"INTEGER PRIMARY KEY ,"+col_Name
                +"TEXT),"+col_add+"TEXT);");
    }
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXIST"+table_name);
        onCreate(db);
    }

    public void insert(String name,String add){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col_Name,name);
        cv.put(col_add,add);
        db.insert(table_name,null,cv);

    }
}
