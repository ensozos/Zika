package com.example.bill.myapplication;


import java.util.ArrayList;

public class QuestionLibrary {


    private String mQuestions [] = {
            "What is your race?",
            "What is your age?",
            "What is your gender?"
    };


    private String mChoices [][]= {
            {"White", "Black/Indian", "Asian"},
            {"<18", "18-60", "60<"},
            {"Male", "Female"}
    };


    private String mAnswers[]={" "};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getAnswer(int a){
        String answer = mAnswers[a];
        return answer;
    }






}
