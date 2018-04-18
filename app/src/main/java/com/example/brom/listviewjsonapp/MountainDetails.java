package com.example.brom.listviewjsonapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.InputStream;

public class MountainDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();

        String name = extras.getString("EXTRA_NAME");
        String location = extras.getString("EXTRA_LOCATION");
        String height = extras.getString("EXTRA_HEIGHT");

        TextView nameText = (TextView) findViewById(R.id.mountainNameText);
        TextView heightText = (TextView) findViewById(R.id.mountainHeightText);
        TextView locationText = (TextView) findViewById(R.id.mountainLocationText);

        nameText.setText(name);
        heightText.setText(height);
        locationText.setText(location);

    }

            protected Bitmap doInBackground(String... urls) {
                String urldisplay = urls[0];
                Bitmap mountain = null;
                try {
                    InputStream in = new java.net.URL(urldisplay).openStream();
                    mountain = BitmapFactory.decodeStream(in);
                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }
                return mountain;
            }

            protected void onPostExecute(Bitmap result) {
            }
        }

