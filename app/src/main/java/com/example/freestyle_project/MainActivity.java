package com.example.freestyle_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = this.prefs;
        if(prefs.getString("APP_PASSWORD", "") == ""){
            Intent intent = new Intent(this, AuthActivity.class);
            startActivity(intent);
            finish();
        }

        setContentView(R.layout.activity_main);
    }
}
