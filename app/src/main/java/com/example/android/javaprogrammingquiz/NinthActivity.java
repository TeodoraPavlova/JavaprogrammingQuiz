package com.example.android.javaprogrammingquiz;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.android.javaprogrammingquiz.SecondActivity.trackingScore;


public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        ImageView checkingScore = (ImageView) findViewById(R.id.final_button_show_score);

        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(checkingScore,
                PropertyValuesHolder.ofFloat("scaleX", 1.1f),
                PropertyValuesHolder.ofFloat("scaleY", 1.1f));
        scaleDown.setDuration(400);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        checkingScore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "Your score is " + trackingScore + "/6", Toast.LENGTH_LONG).show();

            }
        });


    }
}







