package com.example.jsonpractice.readfromAssest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.jsonpractice.R;
import com.example.jsonpractice.databinding.ActivityUserListBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class UserList extends AppCompatActivity {
    private ActivityUserListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUserListBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        String jsonFileString = Utils.getJsonFromAssestd(getApplicationContext(), "bezkoder.json");

        Gson gson=new Gson();
        Type listUserType = new TypeToken<List<User>>() { }.getType();

        List<User> users = gson.fromJson(jsonFileString, listUserType);
        for (int i = 0; i < users.size(); i++) {
            Log.i("data", "> Item " + i + "\n" + users.get(i));
        }
        ArrayAdapter<User> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,users);
        binding.userlist.setAdapter(adapter);

    }
}
