package com.example.bill.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VirusActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;



    private String mAnswer;
    private int mQuestionNumber = 0;
    private int mScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virus);

        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                }
                updateQuestion();

            }

            });

         mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                    if (mButtonChoice2.getText() == mAnswer) {
                        mScore = mScore + 1;
                    }
                    updateQuestion();
             }

          });


         mButtonChoice3.setOnClickListener(new View.OnClickListener(){
             public void onClick(View view) {

                 if (mButtonChoice3.getText() == mAnswer) {
                     mScore = mScore + 1;
                 }
                 updateQuestion();

             }

          });

        }


        private void updateQuestion(){
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

            mAnswer = mQuestionLibrary.getAnswer(mQuestionNumber);
            mQuestionNumber++;
        }






    }

