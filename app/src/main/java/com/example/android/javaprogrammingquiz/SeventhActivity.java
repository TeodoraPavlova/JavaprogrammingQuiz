package com.example.android.javaprogrammingquiz;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import static com.example.android.javaprogrammingquiz.SecondActivity.trackingScore;


public class SeventhActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        ImageView imageGoToQuestionSix = (ImageView) findViewById(R.id.next_button_to_sixth_question);

        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(imageGoToQuestionSix,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f));
        scaleDown.setDuration(450);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        imageGoToQuestionSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText typeYourAnswer = (EditText) findViewById(R.id.answer_fifth_question);
                String checkTheAnswer = typeYourAnswer.getText().toString();

                Intent intentToTheEighth = new Intent(SeventhActivity.this, EighthActivity.class);

                if (checkTheAnswer.equalsIgnoreCase("void")) {
                    trackingScore = trackingScore + 1;
                    startActivity(intentToTheEighth);
                } else {
                    startActivity(intentToTheEighth);
                }


            }
        });


    }
}