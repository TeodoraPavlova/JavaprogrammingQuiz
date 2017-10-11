package com.example.android.javaprogrammingquiz;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import static com.example.android.javaprogrammingquiz.R.id.start_quiz_button;


public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        ImageView imageGoToQuiz = (ImageView) findViewById(start_quiz_button);
        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(imageGoToQuiz,
                PropertyValuesHolder.ofFloat("scaleX", 1.1f),
                PropertyValuesHolder.ofFloat("scaleY", 1.1f));
        scaleDown.setDuration(400);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        imageGoToQuiz.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View v) {
                                                 Intent intentToTheThird = new Intent(SecondActivity.this, ThirdActivity.class);
                                                 startActivity(intentToTheThird);
                                             }

                                         }
        );
    }

    public static int trackingScore = 0;

}
