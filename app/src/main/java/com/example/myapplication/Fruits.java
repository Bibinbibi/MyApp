package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Fruits extends AppCompatActivity {

    String fruits[] ={"Mango","Orange","Apple","Pineapple","Grapes",};
    int fruitsimg[] ={R.drawable.mango,R.drawable.orange,R.drawable.apple,R.drawable.pineapple,R.drawable.grapes};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        ListView fruitlist =(ListView) findViewById(R.id.fruitlist);

        CustomFruits customFruits = new CustomFruits(getApplicationContext(),fruits,fruitsimg);
        fruitlist.setAdapter(customFruits);
    }
}