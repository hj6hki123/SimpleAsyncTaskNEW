package com.example.myapplication;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<URL,Integer,Long> {


    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }
    @Override
    protected Long doInBackground(URL... urls) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }



    protected void onPostExecute(Long aLong) {
        super.onPostExecute(aLong);
    }



}
