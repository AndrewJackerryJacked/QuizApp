package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button True;
    private Button False;
    private boolean isCorrect;
    private String question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
    }

    private void wireWidgets() {
        True = findViewById(R.id.button_main_true);
        False = findViewById(R.id.button_main_false);
    }

}
