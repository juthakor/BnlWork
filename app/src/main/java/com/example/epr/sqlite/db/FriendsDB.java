package com.example.epr.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by epr on 9/2/2561.
 */

public class FriendsDB {

    private FriendsDBHelper helper;
    private SQLiteDatabase db;

    //Constructor
    public FriendsDB(Context context){
        helper = new FriendsDBHelper(context);
    }


}
