package com.example.epr.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by epr on 9/2/2561.
 */

public class FriendsDBHelper extends SQLiteOpenHelper {

    public static String TABLE_NAME = "friends";
    public static int TABLE_VERSION = 1;
    public static String TABLE_CREATE_SQL = "CREATE TABLE" +TABLE_NAME+ "(" +
                                                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                                "fname TEXT(20), " +
                                                "lname TEXT(20), " +
                                                "nickname TEXT(10), " +
                                                ")";

    public FriendsDBHelper(Context context) {
        super(context, TABLE_NAME, null, TABLE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
