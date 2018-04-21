package com.example.jokesandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class jokeActivity extends AppCompatActivity {
    TextView jokeTextView;

    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_joke);
        jokeTextView = (TextView) findViewById(R.id.androidJoke_textview);
        Intent intent = getIntent();
        String random_jokes = intent.getStringExtra("random_jokes");
        if (random_jokes != null && random_jokes.length() != 0) {
            jokeTextView.setText(random_jokes);
        }
    }
}
