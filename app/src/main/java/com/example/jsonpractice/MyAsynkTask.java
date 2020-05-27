package com.example.jsonpractice;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MyAsynkTask extends AsyncTask<String,Void,String> {


    public interface OnTaskCompleteListener{
        void onTaskCompleted(String result);
    }

    private OnTaskCompleteListener listener;

    private Context context;
    private ProgressDialog pd;
    public MyAsynkTask(Context context, OnTaskCompleteListener listener){
        this.listener=listener;
        this.context=context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd=ProgressDialog.show(context,"Wait","Fetching Data...");

    }

    @Override
    protected String doInBackground(String... strings) {
        OkHttpClient client=new OkHttpClient(); // behaves like browser
        Request request=new Request.Builder().url(strings[0]).build();
        try {
            Response response=client.newCall(request).execute();
            String result=response.body().string();
            Log.i("RESULT",result);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        pd.dismiss();
        listener.onTaskCompleted(s);
    }
}
