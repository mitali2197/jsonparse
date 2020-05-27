package com.example.jsonpractice;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AsyncClass extends AsyncTask<String,Void,String> {

    public interface OnTaskCompleteListener{
        void OnTaskComplete(String result);
    }

    Context context;
    private OnTaskCompleteListener listener;

    public AsyncClass(Context context, OnTaskCompleteListener listener) {
        this.context = context;
        this.listener = listener;
    }

    @Override
    protected String doInBackground(String... strings) {
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(strings[0]).build();

        try{
            Response response=client.newCall(request).execute();
            String result=response.body().string();
            Log.i("RESULT",result);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
