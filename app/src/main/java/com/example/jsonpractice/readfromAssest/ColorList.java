package com.example.jsonpractice.readfromAssest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.jsonpractice.R;
import com.example.jsonpractice.databinding.ActivityColorListBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ColorList extends AppCompatActivity {
    private ActivityColorListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityColorListBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        String jsonFileString = Utils.getJsonFromAssestd(getApplicationContext(), "colors.json");

        Gson gson=new Gson();
        ColorRoot root=gson.fromJson(jsonFileString,ColorRoot.class);
        List<ColorRoot.Colors> colors=root.getColors();
        for (int i = 0; i < colors.size(); i++) {
            Log.i("colordata", "> Item " + i + "\n" + colors.get(i));
        }

//        Gson gson=new Gson();
//        Type listColorType = new TypeToken<List<ColorRoot>>() { }.getType();
//
//        List<ColorRoot> colors = gson.fromJson(jsonFileString, listColorType);
//
//        for (int i = 0; i < colors.size(); i++) {
//            Log.i("colordata", "> Item " + i + "\n" + colors.get(i));
//        }
        ArrayAdapter<ColorRoot.Colors> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,colors);
        binding.colorlistview.setAdapter(adapter);
    }
}
