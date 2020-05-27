package com.example.jsonpractice.countryparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.jsonpractice.MyAsynkTask;
import com.example.jsonpractice.R;
import com.example.jsonpractice.databinding.ActivityCountryListBinding;
import com.google.gson.Gson;

import java.util.List;

public class CountryList extends AppCompatActivity implements MyAsynkTask.OnTaskCompleteListener {
    private ActivityCountryListBinding binding;
    private String Url="https://api.printful.com/countries";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCountryListBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        MyAsynkTask asynkTask=new MyAsynkTask(this,this);
        asynkTask.execute(Url);

    }

    @Override
    public void onTaskCompleted(String result) {
        Gson gson=new Gson();
        CountryRoot root=gson.fromJson(result,CountryRoot.class);
        List<Country> countries=root.getResult();
        for (int i = 0; i < countries.size(); i++) {
            Log.i("countrydata", "> Item " + i + "\n" + countries.get(i));
        }


    }
}
