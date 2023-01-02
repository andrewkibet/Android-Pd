package com.example.androidpd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class phonecall extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonecall);

        Button startBtn = (Button) findViewById(R.id.makecall);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makecall();

            }
        });
    }
    protected void makecall();
    Log.i("makecall","");

    Intent phoneIntent = new Intent(Intent.ACTION_CALL);
    phoneIntent.setData(Uri.parse("tel:91-800-001-0101"))

}