package com.example.quizapp;

mport androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Quiz
{
    private int currentQuestion;
    List<Question> questions;
    private int score;
    private boolean hasmoreQs;
    Question nextQuestionl;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            wireWidgets();

        }

}
