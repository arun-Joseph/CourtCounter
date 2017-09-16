package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Resets score
     */
    public void resetScore(View view) {
        scoreTeamA=scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Adds 3 to score for Team A.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 2 to score for Team A.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 1 to score for Team A.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 to score for Team B.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 2 to score for Team B.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 to score for Team B.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
