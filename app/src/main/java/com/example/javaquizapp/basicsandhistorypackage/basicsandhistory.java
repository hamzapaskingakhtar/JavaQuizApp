package com.example.javaquizapp.basicsandhistorypackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.javaquizapp.R;

public class basicsandhistory extends AppCompatActivity {
    // Creating object of the question library
    private BasicsAndHistoryQuesLibrary mBasicsAndHistoryQuesLibrary = new BasicsAndHistoryQuesLibrary();
    // Creating necessary variables
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsandhistory);

        // Initializing
        mScoreView = findViewById(R.id.score);
        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.button_choice1);
        mButtonChoice2 = findViewById(R.id.button_choice2);
        mButtonChoice3 = findViewById(R.id.button_choice3);
        updateQuestions();

        // Create a listener to handle clicks
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice1.getText() == mAnswer)
                {
                    mScore = mScore + 1; //mScore++
                    updateScore(mScore);
                    //updateQuestions();
                    // Adding a toast message to toast if right or wrong
                    Toast.makeText(basicsandhistory.this,"correct",Toast.LENGTH_SHORT).show();

                    // Perform check if last question on Quiz to avoid crash on last
                    if (mQuestionNumber == mBasicsAndHistoryQuesLibrary.mQuestions.length)
                    {
                        Intent i = new Intent(basicsandhistory.this, basicsandhistoryResults.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        basicsandhistory.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestions();
                    }
                }
                else
                {
                    Toast.makeText(basicsandhistory.this,"wrong",Toast.LENGTH_SHORT).show();
                    // Perform check if last question on Quiz to avoid crash on last
                    if (mQuestionNumber == mBasicsAndHistoryQuesLibrary.mQuestions.length)
                    {
                        Intent i = new Intent(basicsandhistory.this,basicsandhistoryResults.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        basicsandhistory.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestions();
                    }
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice2.getText() == mAnswer)
                {
                    mScore = mScore + 1; //mScore++
                    updateScore(mScore);
                    //updateQuestions();
                    // Adding a toast message to toast if right or wrong
                    Toast.makeText(basicsandhistory.this,"correct",Toast.LENGTH_SHORT).show();

                    // Perform check if last question on Quiz to avoid crash on last
                    if (mQuestionNumber == mBasicsAndHistoryQuesLibrary.mQuestions.length)
                    {
                        Intent i = new Intent(basicsandhistory.this,basicsandhistoryResults.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        basicsandhistory.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestions();
                    }
                }
                else
                {
                    Toast.makeText(basicsandhistory.this,"wrong",Toast.LENGTH_SHORT).show();
                    // Perform check if last question on Quiz to avoid crash on last
                    if (mQuestionNumber == mBasicsAndHistoryQuesLibrary.mQuestions.length)
                    {
                        Intent i = new Intent(basicsandhistory.this,basicsandhistoryResults.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        basicsandhistory.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestions();
                    }
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice3.getText() == mAnswer)
                {
                    mScore = mScore + 1; //mScore++
                    updateScore(mScore);
                    //updateQuestions();
                    // Adding a toast message to toast if right or wrong
                    Toast.makeText(basicsandhistory.this,"correct",Toast.LENGTH_SHORT).show();

                    // Perform check if last question on Quiz to avoid crash on last
                    if (mQuestionNumber == mBasicsAndHistoryQuesLibrary.mQuestions.length)
                    {
                        Intent i = new Intent(basicsandhistory.this,basicsandhistoryResults.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        basicsandhistory.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestions();
                    }
                }
                else
                {
                    Toast.makeText(basicsandhistory.this,"wrong",Toast.LENGTH_SHORT).show();
                    // Perform check if last question on Quiz to avoid crash on last
                    if (mQuestionNumber == mBasicsAndHistoryQuesLibrary.mQuestions.length)
                    {
                        Intent i = new Intent(basicsandhistory.this,basicsandhistoryResults.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        basicsandhistory.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestions();
                    }
                }
            }
        });
    }
    private void updateScore(int point)
    {
        mScoreView.setText("" + mScore);
    }
    private void updateQuestions()
    {
        mQuestionView.setText(mBasicsAndHistoryQuesLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mBasicsAndHistoryQuesLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mBasicsAndHistoryQuesLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mBasicsAndHistoryQuesLibrary.getChoice3(mQuestionNumber));
        mAnswer = mBasicsAndHistoryQuesLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
}