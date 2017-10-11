package com.example.android.javaprogrammingquiz;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static com.example.android.javaprogrammingquiz.SecondActivity.trackingScore;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        ImageView imageGoToQuestionFour = (ImageView)
                findViewById(R.id.next_button_to_fourth_question);

        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(imageGoToQuestionFour,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f));
        scaleDown.setDuration(450);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        imageGoToQuestionFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CheckBox firstTrueAnswer = (CheckBox) findViewById(R.id.if_checkBox);
                CheckBox secondTrueAnswer = (CheckBox) findViewById(R.id.extends_checkBox);
                CheckBox incorrectAnswer =(CheckBox) findViewById(R.id.string_checkBox);
                CheckBox incorrectAnswerTwo=(CheckBox) findViewById(R.id.bool_checkBox);

                Intent intentToTheSixth = new Intent(FifthActivity.this, SixthActivity.class);
                if(firstTrueAnswer.isChecked() && secondTrueAnswer.isChecked() &&
                        incorrectAnswer.isChecked() && incorrectAnswerTwo.isChecked()){
                    startActivity(intentToTheSixth);
                }else if(firstTrueAnswer.isChecked() && secondTrueAnswer.isChecked() &&
                        incorrectAnswer.isChecked()){
                    startActivity(intentToTheSixth);
                }else if(firstTrueAnswer.isChecked() && secondTrueAnswer.isChecked()
                        && incorrectAnswerTwo.isChecked()){
                    startActivity(intentToTheSixth);
                }else if(firstTrueAnswer.isChecked() && secondTrueAnswer.isChecked()) {
                    trackingScore = trackingScore + 1;
                    startActivity(intentToTheSixth);
                }
            }}
        );
    }
}