package com.pclg.topquiz.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pclg.topquiz.R;

public class ScoresActivity extends AppCompatActivity {

    private TextView mTitleText;
    private Button mPlayButton;
    private Button mMainButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        System.out.println("ScoresActivity::onCreate()");



        mTitleText = (TextView) findViewById(R.id.activity_scores_title_txt);
        mPlayButton = (Button) findViewById(R.id.activity_scores_play_btn);
        mMainButton = (Button) findViewById(R.id.activity_scores_main_btn);


        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainActivityIntent = new Intent(ScoresActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivityIntent = new Intent(ScoresActivity.this, GameActivity.class);
                startActivity (gameActivityIntent);
            }
        });

    }

}
