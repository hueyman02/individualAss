package my.edu.utar.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLiteAdapter {

    public static final String MYDATABASE_NAME = "MY_DATABASE";
    public static final String MYDATABASE_TABLE = "MY_TABLE3";
    public static final int MYDATABASE_VERSION = 6;
    public static final String KEY_CONTENT = "Name";
    public static final String KEY_CONTENT2 = "Scores";

    private static final String SCRIPT_CREATE_DATABASE = "create table "
            + MYDATABASE_TABLE + " (" + KEY_CONTENT + "TEXT NOT NULL);";

    private static final String SCRIPT_UPDATE_DATABASE = "create table "
            + MYDATABASE_TABLE + " (id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + KEY_CONTENT + " TEXT NOT NULL, "
            + KEY_CONTENT2 + " TEXT);";

    private SQLiteHelper sqLiteHelper;
    private SQLiteDatabase sqLiteDatabase;
    private Context context;

    public void SQLiteAdapter(Context c) {
        context = c;
    }

    public <SQLiteAdaptor> SQLiteAdaptor openToRead() throws android.database.SQLException {
        sqLiteHelper = new SQLiteHelper(context, MYDATABASE_NAME, null, MYDATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getReadableDatabase();
        return (SQLiteAdaptor) this;
    }

    public <SQLiteAdaptor> SQLiteAdaptor openToWrite() throws android.database.SQLException {
        sqLiteHelper = new SQLiteHelper(context, MYDATABASE_NAME, null, MYDATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();
        return (SQLiteAdaptor) this;
    }

    public void close() {
        sqLiteHelper.close();
    }

    public long insert(String content, String content2, int content3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_CONTENT, content);
        contentValues.put(KEY_CONTENT2, content2);


        return sqLiteDatabase.insert(MYDATABASE_TABLE, null, contentValues);
    }

    public int deleteAll() {
        return sqLiteDatabase.delete(MYDATABASE_TABLE, null, null);
    }

    public String queueAll() {
        String[] columns = new String[] { KEY_CONTENT, KEY_CONTENT2 };
        Cursor cursor = sqLiteDatabase.query(MYDATABASE_TABLE, columns, null, null, null, null, null);
        String result = "";
        int index_CONTENT = cursor.getColumnIndex(KEY_CONTENT);
        int index_CONTENT2 = cursor.getColumnIndex(KEY_CONTENT2);

        for (cursor.moveToFirst(); !(cursor.isAfterLast()); cursor.moveToNext()) {
            result = result + cursor.getString(index_CONTENT) + "\n" + cursor.getString(index_CONTENT2) + "\n" ;
        }

        return result;
    }

    public String queueByProgramme(String score) {
        String[] columns = new String[] { KEY_CONTENT, KEY_CONTENT2 };
        Cursor cursor = sqLiteDatabase.query(MYDATABASE_TABLE, columns, KEY_CONTENT2+"=?", new String[] {score}, null, null, KEY_CONTENT +" ASC",null);
        String result = "";
        int index_CONTENT = cursor.getColumnIndex(KEY_CONTENT);
        int index_CONTENT2 = cursor.getColumnIndex(KEY_CONTENT2);

        for (cursor.moveToFirst(); !(cursor.isAfterLast()); cursor.moveToNext()) {
            result = result + cursor.getString(index_CONTENT) + "\n" + cursor.getString(index_CONTENT2) + "\n" ;
        }

        return result;
    }

    public class SQLiteHelper extends SQLiteOpenHelper {
        public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SCRIPT_CREATE_DATABASE);
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try{
                db.execSQL(SCRIPT_UPDATE_DATABASE);
            }catch(Exception ex){
                Log.e("DB Upgrade:", "onUpgrade: "+ex.getMessage());
            }

        }
    }
}
