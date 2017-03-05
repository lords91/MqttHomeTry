package lords91.raspy.domotic;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by claudiocavallaro on 04/03/17.
 */

public class Async extends AsyncTask<Void, Void, Void> {

    private String url = "";


    @Override
    protected Void doInBackground(Void... params) {
        Log.v("url",url);
        try{
            HttpClient request = new DefaultHttpClient();
            HttpGet get = new HttpGet(getUrl());
            HttpResponse response = request.execute(get);
            int responseCode = response.getStatusLine().getStatusCode();
            if(responseCode == 200){
                Log.v("log di 200", "ok");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
