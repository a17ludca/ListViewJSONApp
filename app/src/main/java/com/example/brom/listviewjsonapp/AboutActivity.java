package com.example.brom.listviewjsonapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button mShowDialog = (Button) findViewById(R.id.btnShow);
        mShowDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(AboutActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.aboutdialog, null);
                Button mAccept = (Button) mView.findViewById(R.id.btnAccept);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                mAccept.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        dialog.hide();
                    }
                });
            }
        });
    }
}
