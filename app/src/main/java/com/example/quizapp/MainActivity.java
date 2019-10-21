package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private Button True;
    private Button False;
    private boolean isCorrect;
    private String question;
    private int currentQuestion;
    List<String> questions = new ArrayList<String>();
    private int score;
    InputStream XmlFileInputStream = getResources().openRawResource(R.raw.taskslists5items);
    private boolean hasmoreQs;
    Question nextQuestion;
    String sxml = readTextFile(XmlFileInputStream);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();

        Gson gson = new Gson();
    }

    public int getCurrentQuestion(int currentQuestion)
    {
        return currentQuestion;
    }

    public String getQuestion(String Question)
    {
        return Question;
    }

    public String readTextFile(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {

        }
        return outputStream.toString();
    }
    // create a gson object
    Gson gson = new Gson();
    // read your json file into an array of questions
    Question[] questions =  gson.fromJson(jsonString, Question[].class);
    // convert your array to a list using the Arrays utility class
    List<Question> questionList = Arrays.asList(questions);
// verify that it read everything properly
Log.d(TAG, "onCreate: " + questionList.toString());

    private void wireWidgets() {
        True = findViewById(R.id.button_main_true);
        False = findViewById(R.id.button_main_false);

    }


}
