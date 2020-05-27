package com.example.jsonpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.jsonpractice.StateofIndia.IndianState;

import com.example.jsonpractice.countryparsing.CountryList;
import com.example.jsonpractice.databinding.ActivityMainBinding;
import com.example.jsonpractice.employeeDetails.Employeelist;
import com.example.jsonpractice.readfromAssest.ColorList;
import com.example.jsonpractice.readfromAssest.UserList;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(MainActivity.this, CountryList.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1=new Intent(MainActivity.this, IndianState.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2=new Intent(MainActivity.this, Employeelist.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3=new Intent(MainActivity.this, UserList.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4=new Intent(MainActivity.this, ColorList.class);
                        startActivity(i4);
                        break;



                }
            }
        });
    }
}
