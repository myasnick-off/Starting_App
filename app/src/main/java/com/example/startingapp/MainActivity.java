package com.example.startingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri calcUri = Uri.parse("scheme://calculator");

                Intent launchIntent = new Intent(Intent.ACTION_VIEW, calcUri);
                Intent chooser = Intent.createChooser(launchIntent, "Start calc");
                startActivity(chooser);

            }
        });
    }
}