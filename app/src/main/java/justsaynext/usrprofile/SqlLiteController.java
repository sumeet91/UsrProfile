package justsaynext.usrprofile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SqlLiteController extends SQLiteOpenHelper
{
    private static final String LOGCAT=null;
    private static final String COL_1="ID";
    private static final String COL_2="Date";
    private static final String COL_3="Number";
    private static final String COL_4="CallType";
    private static final String COL_5="CallDuration";
    public SqlLiteController(Context applicationcontext)
    {
        super(applicationcontext,"userprofile.db",null,1);
        Log.d(LOGCAT,"Created");

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query;
        query="CREATE TABLE TotaltimeCall(Callid INTEGER PRIMARY KEY AUTOINCREMENT,Date VARCHAR, Number VARCHAR, CallType VARCHAR, CallDuration VARCHAR )";
        db.execSQL(query);
        Log.d(LOGCAT, "TotalTimeCall Table Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query;
        query = "DROP TABLE IF EXISTS TotaltimeCall";
        db.execSQL(query);
        onCreate(db);

    }
    public void insertTotaltimeCall(String Date,String Number, String CallType, String CallDuration) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
        values.put(COL_2, sdf.format(new Date()));
        values.put(COL_3,Number);
        values.put(COL_4, CallType);
        values.put(COL_5, CallDuration);
        db.insert("TotalTimeCall", null, values);

    }

   /* public ArrayList<FetchDataFromTotalTimeCallDB> getDataFromTotalTimeCall()
    {
        ArrayList<FetchDataFromTotalTimeCallDB> fetchData = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT  * FROM TotaltimeCall ";

        Cursor c = db.rawQuery(selectQuery, null);
        if (c.moveToFirst()) {
            do {

                fetchData.add(new FetchDataFromTotalTimeCallDB(

                        c.getString(c.getColumnIndex("Date")),        // id
                        c.getInt(1),     // title
                        c.getString(2),
                        c.getInt(3)// content
                ));

            } while (c.moveToNext());
        }
        return fetchData;
    }*/
}