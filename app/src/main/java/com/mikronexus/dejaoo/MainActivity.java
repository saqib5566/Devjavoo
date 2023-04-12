package com.mikronexus.dejaoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    LinearLayout switchButton;
    TextView dateTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton = findViewById(R.id.switchButton);
        dateTime = findViewById(R.id.dateTime);


        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
        dateTime.setText(currentDateTimeString);
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.pakzon.customerfacingapp");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }

            }
        });
    }
}