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


public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);


        ImageView imageGoToQuestionFive = (ImageView) findViewById(R.id.next_button_to_fifth_question);

        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(imageGoToQuestionFive,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f));
        scaleDown.setDuration(450);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        imageGoToQuestionFive.setOnClickListener(new View.OnClickListener() {
                                                     public void onClick(View v) {

                                                         Intent intentToTheSeventh = new Intent(SixthActivity.this, SeventhActivity.class);

                                                         RadioGroup fourthQuestion = (RadioGroup) findViewById(R.id.fourth_question);
                                                         if (fourthQuestion.getCheckedRadioButtonId() == R.id.the_correct_answer) {
                                                             trackingScore = trackingScore + 1;
                                                             startActivity(intentToTheSeventh);
                                                         } else {
                                                             startActivity(intentToTheSeventh);
                                                         }

                                                     }

                                                 }
        );

    }

}