package com.example.androidpd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
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
            try {
        startActivity(phoneIntent);
        finish();
        Log.i("Finished making a call...", "");
    } catch (android.content.ActivityNotFoundException ex) {
        Toast.makeText(MainActivity.this,
                "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
    }
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}