package com.example.javaquizapp.controlstatementspackage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.javaquizapp.R;

public class controlstatementsResults extends AppCompatActivity {
    private ControlStatementsQuestionLibrary mControlStatementsQuestionLibrary = new ControlStatementsQuestionLibrary();
    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controlstatements_results);
        mGrade = findViewById(R.id.grade);
        mFinalScore = findViewById(R.id.outOf);
        mRetryButton = findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        mFinalScore.setText("You Scored "+score+" out of " + mControlStatementsQuestionLibrary.mQuestions.length);
        if(score>=7)
        {
            mGrade.setText("Outstanding");
        }
        else if (score>=5)
        {
            mGrade.setText("Good effort");
        }
        else
        {
            mGrade.setText("Go over your notes once again");
        }
        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(controlstatementsResults.this, controlstatements.class));
            }
        });
    }
}
