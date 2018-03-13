
package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //Score for Team A
    int points = 0;
    //Score for Team B
    int pointsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        displayForTeamA(0);
        displayForTeamB(0);
    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Functions for adding points for Team A
    public void threePoints(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        points = points + 3;
        scoreView.setText(String.valueOf(points));
    }

    public void twoPoints(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        points = points + 2;
        scoreView.setText(String.valueOf(points));
    }

    public void onePoint(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        points = points + 1;
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    //Functions for adding points for Team B
    public void threePointsB(View view) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        pointsB = pointsB + 3;
        scoreViewB.setText(String.valueOf(pointsB));
    }

    public void twoPointsB(View view) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        pointsB = pointsB + 2;
        scoreViewB.setText(String.valueOf(pointsB));
    }

    public void onePointB(View view) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        pointsB = pointsB + 1;
        scoreViewB.setText(String.valueOf(pointsB));
    }

    public void reset(View v) {
        points = 0;
        pointsB = 0;
        displayForTeamB(pointsB);
        displayForTeamA(points);

    }
}
