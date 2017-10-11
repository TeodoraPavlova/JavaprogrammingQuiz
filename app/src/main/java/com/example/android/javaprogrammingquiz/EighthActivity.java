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

public class EighthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        ImageView imageGoToQuestionSeven = (ImageView) findViewById(R.id.next_button_to_seventh_question);

        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(imageGoToQuestionSeven,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f));
        scaleDown.setDuration(450);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();

        imageGoToQuestionSeven.setOnClickListener(new View.OnClickListener() {
                                                      public void onClick(View v) {

                                                          CheckBox firstTrueAnswer = (CheckBox) findViewById(R.id.float_checkBox);
                                                          CheckBox secondTrueAnswer = (CheckBox) findViewById(R.id.double_checkBox);
                                                          CheckBox thirdTrueAnswer = (CheckBox) findViewById(R.id.int_checkBox);

                                                          Intent intentToTheNinth = new Intent(EighthActivity.this, NinthActivity.class);

                                                          if (firstTrueAnswer.isChecked() && secondTrueAnswer.isChecked() && thirdTrueAnswer.isChecked()) {
                                                              trackingScore = trackingScore + 1;
                                                              startActivity(intentToTheNinth);
                                                          } else {
                                                              startActivity(intentToTheNinth);
                                                          }

                                                      }


                                                  }


        );


    }
}