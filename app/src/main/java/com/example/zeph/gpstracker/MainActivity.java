package com.example.zeph.gpstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMaps(View view) {
        Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(mapIntent);
    }
}
