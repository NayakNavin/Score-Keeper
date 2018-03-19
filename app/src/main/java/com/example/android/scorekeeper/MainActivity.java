package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



    public class MainActivity extends AppCompatActivity {
        int scoreTeamA = 0, scoreTeamB = 0, foulTeamA = 0, foulTeamB = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(com.example.android.scorekeeper.R.layout.activity_main);
        }

    //    @Override
      //  public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
        //    getMenuInflater().inflate(com.example.android.scorekeeper.R.menu.menu_main, menu);
          //  return true;
        //}

//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            // Handle action bar item clicks here. The action bar will
//            // automatically handle clicks on the Home/Up button, so long
//            // as you specify a parent activity in AndroidManifest.xml.
//            int id = item.getItemId();
//
//            //noinspection SimplifiableIfStatement
//            if (id == com.example.android.scorekeeper.R.id.action_settings) {
//                return true;
//            }
//
//            return super.onOptionsItemSelected(item);
//        }

        /**
         * Increase the foul for Team A by 1 point.
         */
        public void foulForTeamA(View v) {
            //   int score = 1;
            foulTeamA = foulTeamA + 1;
            foulForTeamA(foulTeamA);
        }

        public void foulForTeamB(View v) {
            //   int score = 1;
            foulTeamB = foulTeamB + 1;
            foulForTeamB(foulTeamB);
        }

        /**
         * Increase the score for Team A by 2 points.
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
         * Increase the score for Team A by 3 points.
         */
        public void addThreeForTeamA(View v) {

            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        }

        public void addThreeForTeamB(View v) {

            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }

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
            TextView scoreView = (TextView) findViewById(com.example.android.scorekeeper.R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }

        /**
         * Displays the given score for Team B.
         */
        public void displayForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(com.example.android.scorekeeper.R.id.team_b_score);
            scoreView.setText(String.valueOf(score));
        }


        public void foulForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(com.example.android.scorekeeper.R.id.team_a_foul);
            scoreView.setText(String.valueOf(score));
        }


        public void foulForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(com.example.android.scorekeeper.R.id.team_b_foul);
            scoreView.setText(String.valueOf(score));
        }
    }


