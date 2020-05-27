package com.example.jsonpractice.StateofIndia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.jsonpractice.MyAsynkTask;
import com.example.jsonpractice.databinding.ActivityIndianStateBinding;
import com.google.gson.Gson;

public class IndianState extends AppCompatActivity implements MyAsynkTask.OnTaskCompleteListener {
    private ActivityIndianStateBinding binding;
     String Url="https://indian-cities-api-nocbegfhqg.now.sh/cities";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIndianStateBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        MyAsynkTask asynkTask=new MyAsynkTask(IndianState.this,this);
        asynkTask.execute(Url);
    }

    @Override
    public void onTaskCompleted(String result) {
        Gson gson=new Gson();
        India[] india=gson.fromJson(result, India[].class);
        ArrayAdapter<India> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,india);
        binding.lvIndianstate.setAdapter(adapter);
    }
}
