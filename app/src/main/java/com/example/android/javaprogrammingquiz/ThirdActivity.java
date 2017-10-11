package com.example.android.javaprogrammingquiz;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import static com.example.android.javaprogrammingquiz.SecondActivity.trackingScore;


public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        ImageView imageGoToQuestionTwo = (ImageView)
                findViewById(R.id.next_button_to_second_question);

        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(imageGoToQuestionTwo,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f));
        scaleDown.setDuration(450);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        imageGoToQuestionTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentToTheFourth = new Intent(ThirdActivity.this, FourthActivity.class);
                RadioGroup firstQuestion = (RadioGroup) findViewById(R.id.first_question);
                if (firstQuestion.getCheckedRadioButtonId() == R.id.the_correct_answer) {
                    trackingScore = trackingScore + 1;
                    startActivity(intentToTheFourth);
                } else {
                    startActivity(intentToTheFourth);
                }

            }}
        );
    }
}



