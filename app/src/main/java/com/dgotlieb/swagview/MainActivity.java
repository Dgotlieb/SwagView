package com.dgotlieb.swagview;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SwagPoints swagPoints = new SwagPoints(this);//(SwagPoints)findViewById(R.id.my_swag);

    }
}
