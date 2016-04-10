package developer_lab.com.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RAKIB on 4/9/2016.
 */
public class dbConnect extends SQLiteOpenHelper {
    public static  final String Database_name="student.db";
    public static  final String table_name="student_data";
    public static  final String col_1="ID";
    public static  final String col_2="NAME";
    public static  final String col_3="SURNAME";
    public static  final String col_4="MARKS";


    public dbConnect(Context context) {
        super(context, Database_name, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + table_name + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS"+table_name);
        onCreate(db);
    }

    public boolean insertData(String name,String surname,String marks)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues content=new ContentValues();
        content.put(col_2,name);
        content.put(col_3,surname);
        content.put(col_4, marks);
        long result = db.insert(table_name,null,content);

        if(result==-1)
        {
            return false;
        }
        else
            return true;
    }
    public Cursor showData()
    {
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from "+table_name,null);
        return res;


    }

    public boolean updateDta(String id,String name,String surname,String marks)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues content = new ContentValues();
        content.put(col_1,id);
        content.put(col_2,name);
        content.put(col_3,surname);
        content.put(col_4, marks);
        long result = db.update(table_name, content, "ID=?", new String[]{id});
        return true;


    }

    public Integer deleteData(String id)
    {
        SQLiteDatabase db= this.getWritableDatabase();

        return db.delete(table_name,"ID=?",new String[] {id});
    }

}
