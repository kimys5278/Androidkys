package com.cookandroid.homepractice07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DogAtivity extends AppCompatActivity {
    TextView Dtext1;
    Button Dbtn1;
    ImageView Dim1;
    float angle = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_ativity);

        Dtext1 = (TextView) findViewById(R.id.Dtext1);
        Dbtn1 = (Button) findViewById(R.id.Dbtn1);
        Dim1 = (ImageView) findViewById(R.id.Dim1);

        Dbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dim1.setRotation(angle);
                angle += 10;
            }
        });
    }
}