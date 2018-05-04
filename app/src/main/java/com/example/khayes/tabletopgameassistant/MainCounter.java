package com.example.khayes.tabletopgameassistant;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainCounter extends AppCompatActivity {

    public int health = 20;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_counter);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        TextView healthView = (TextView) findViewById(R.id.healthTotal);
        healthView.setText(""+health);
    }

    public void increaseHealth(View view){
        health++;

        TextView healthView = (TextView) findViewById(R.id.healthTotal);
        healthView.setText(""+health);
    }

    public void deceraseHealth(View view){
        health--;

        TextView healthView = (TextView) findViewById(R.id.healthTotal);
        healthView.setText(""+health);
    }

    public void rollFour(View view){
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;

        Button dFour = (Button) findViewById(R.id.diceFour);
        dFour.setText(""+n);
    }

    public void rollSix(View view){
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;

        Button dSix = (Button) findViewById(R.id.diceSix);
        dSix.setText(""+n);
    }

    public void rollTen(View view){
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;

        Button dTen = (Button) findViewById(R.id.diceTen);
        dTen.setText(""+n);
    }

    public void rollTwenty(View view){
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;

        Button dTwenty = (Button) findViewById(R.id.diceTwenty);
        dTwenty.setText(""+n);
    }

    public void rollRealSix(View view) {
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;

        Button realSix = (Button) findViewById(R.id.realSix);
        realSix.setText("" + n);
    }

    public void rollRealTwenty(View view) {
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;

        Button realTwenty = (Button) findViewById(R.id.realTwenty);
        realTwenty.setText("" + n);
    }

    public void rollRealFour(View view) {
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;

        Button realFour = (Button) findViewById(R.id.realFour);
        realFour.setText("" + n);
    }

    public void rollRealTen(View view) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;

        Button realTen = (Button) findViewById(R.id.realTen);
        realTen.setText("" + n);
    }

}
