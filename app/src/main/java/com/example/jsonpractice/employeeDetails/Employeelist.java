package com.example.jsonpractice.employeeDetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.jsonpractice.MyAsynkTask;
import com.example.jsonpractice.databinding.ActivityEmployeelistBinding;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Employeelist extends AppCompatActivity implements MyAsynkTask.OnTaskCompleteListener {
    private ActivityEmployeelistBinding binding;
    private  String employeeUrl="http://dummy.restapiexample.com/api/v1/employees";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEmployeelistBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        MyAsynkTask asynkTask=new MyAsynkTask(Employeelist.this,this);
        asynkTask.execute(employeeUrl);
    }

    @Override
    public void onTaskCompleted(String result) {
        Gson gson=new Gson();
        EmployeeRespo root=gson.fromJson(result,EmployeeRespo.class);
        List<EmployeeRoot> employees=root.getData();
        for (int i = 0; i < employees.size(); i++) {
            Log.i("employeedata", "> Item " + i + "\n" + employees.get(i));
        }
        ArrayAdapter<EmployeeRoot> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,employees);
        binding.employeelv.setAdapter(adapter);
    }
}
