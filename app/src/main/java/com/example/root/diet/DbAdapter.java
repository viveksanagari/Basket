package com.example.root.diet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DbAdapter {

    DbHelper helper;
    public DbAdapter(Context context) {
        helper=new DbHelper(context);
    }


    public ArrayList<String> reload2(String[] grolist)
    {
        SQLiteDatabase db=helper.getReadableDatabase();
        String[] columns={DbHelper.item};
        String example = null;
        ArrayList<String> mylist = new ArrayList<String>();
        for (int i=0;i<grolist.length;i++) {
            example = grolist[i];
            Cursor cursor=db.query(DbHelper.tablename, columns, DbHelper.item+" = '"+example+"'", null,null, null,null);

            while (cursor.moveToNext()) {

                int index=cursor.getColumnIndex(DbHelper.item);
                String item=cursor.getString(index);
                mylist.add(item);
            }
            cursor.close();
        }
        return mylist;

    }

    public long insertData(String item)
    {
        SQLiteDatabase db=helper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(DbHelper.item,item);
        long id=db.insert(DbHelper.tablename,null,contentValues);
        return id;
    }

    public int delete(String c)
    {
        SQLiteDatabase db=helper.getWritableDatabase();
        String[] whereArgs={c};
        int count=db.delete(DbHelper.tablename, DbHelper.item+ "=?", whereArgs);
        return count;
    }

    static class DbHelper extends SQLiteOpenHelper
    {
        private static final String db_name="grodb";
        private static final String tablename="grotable";
        private static final int dbversion=1;
        private static final String uid="_id";
        private static final String item="Item";
        private static final String create_table="CREATE TABLE "+tablename+" ("+uid+" INTEGER PRIMARY KEY AUTOINCREMENT, "+item+" VARCHAR(255) UNIQUE)";
        private static final String drop_table="DROP TABLE IF EXISTS "+tablename;
        private Context context;


        public DbHelper(Context context) {
            super(context, db_name, null, dbversion);
            this.context=context;
            //Message.message(context, "constructor called");
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(create_table);
//                Message.message(context, "onCreate called");
            } catch (SQLException e) {
                Message.message(context, ""+e);
            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            try {
//                Message.message(context, "onUpgrade called");
                db.execSQL(drop_table);
                onCreate(db);
            } catch (SQLException e) {
                Message.message(context, ""+e);
            }

        }

    }

}
