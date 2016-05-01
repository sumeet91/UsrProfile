package justsaynext.usrprofile;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by lenovo on 01-05-2016.
 */
public class InsertDataBackground extends AsyncTask<String,Void,String> {

    GetCallDetails details=new GetCallDetails();
    Context ctx;
    public InsertDataBackground(Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }



    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected String doInBackground(String... params) {
        details.getCallDetails(ctx);


    return " " +
            "Insertion operation completed";

    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(ctx,result,Toast.LENGTH_LONG).show();
    }
}
