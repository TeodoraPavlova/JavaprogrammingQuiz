package com.example.android.javaprogrammingquiz;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        ImageView mainButtonJava = (ImageView) findViewById(R.id.java_beginning_image_button);

        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(mainButtonJava,
                PropertyValuesHolder.ofFloat("scaleX", 1.1f),
                PropertyValuesHolder.ofFloat("scaleY", 1.1f));
        scaleDown.setDuration(400);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        mainButtonJava.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intentToTheSecond = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intentToTheSecond);


            }
        });


    }
}






