/*
 * This file was modified based on the project of YAGI TOSHIHIRO.
 */

package com.sarltokyo.sqlcipherforandroidsample;

import android.content.Context;
import android.provider.BaseColumns;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

import java.io.File;

/**
 * Created by osabe on 14/06/12.
 */
public class SampleOpenHelper extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "sample";

    public SampleOpenHelper(Context context) {
//        super(context, new File(context.getExternalFilesDir(null),
//                "cipher_db.db").getAbsolutePath(), null, 1);
        super(context, (new File(context.getApplicationInfo().dataDir + "/cipher_db.db"))
                        .getAbsolutePath(), null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table " + TABLE_NAME + " ( " + BaseColumns._ID
                + " integer primary key autoincrement, " + "no integer, "
                + "name text not null);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }

    public void clear(String pass) {
        getWritableDatabase(pass).execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(getWritableDatabase(pass));
    }
}
