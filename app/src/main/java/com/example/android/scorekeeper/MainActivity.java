package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    Toast toastForTeamA;
    Toast toastForTeamB;
    Button btShowToast_1;
    Button btShowToast_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.scorekeeper.R.layout.activity_main);
        setUpButtonForTeamA();
        setUpButtonForTeamB();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cancelAllPendingToasts();
    }

    @Override
    protected void onStop() {
        super.onStop();
        cancelAllPendingToasts();
    }

    @Override
    protected void onPause() {
        super.onPause();
        cancelAllPendingToasts();
    }

    /**
     * Cancel all the pending toast
     */
    private void cancelAllPendingToasts() {
        if (toastForTeamA != null) {
            toastForTeamA.cancel();
        }
        if (toastForTeamB != null) {
            toastForTeamB.cancel();
        }
    }

    /**
     * @param v Increase the foul for Team A by 1 point.
     */
    public void foulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        foulForTeamA(foulTeamA);
    }

    public void foulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        foulForTeamB(foulTeamB);
    }

    /**
     * @param v Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * @param v Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * @param v Reset the score and foul of both the teams
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        foulForTeamA(foulTeamA);
        foulForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void foulForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given foul for Team B.
     */
    public void foulForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void setUpButtonForTeamA() {
        btShowToast_1 = findViewById(R.id.btnShowToast_1);
        btShowToast_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastForTeamA();
            }
        });
    }

    public void setUpButtonForTeamB() {
        btShowToast_2 = findViewById(R.id.btnShowToast_2);
        btShowToast_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastForTeamB();
            }
        });
    }

    private void showToastForTeamA() {
        if (toastForTeamA == null || !toastForTeamA.getView().isShown()) {
            toastForTeamA = Toast.makeText(getApplicationContext(), "Los Angeles Lakers", Toast.LENGTH_SHORT);
            toastForTeamA.setGravity(Gravity.BOTTOM | Gravity.START, 0, 265);
            toastForTeamA.show();
        }
    }

    private void showToastForTeamB() {
        if (toastForTeamB == null || !toastForTeamB.getView().isShown()) {
            toastForTeamB = Toast.makeText(getApplicationContext(), "Golden State Warriors", Toast.LENGTH_SHORT);
            toastForTeamB.setGravity(Gravity.BOTTOM | Gravity.END, 0, 265);
            toastForTeamB.show();
        }
    }
}
