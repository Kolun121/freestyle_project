package com.example.freestyle_project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class AuthActivity extends AppCompatActivity {
    public SearchPrefs searchPrefs;
    public EditText enterText;
    public String ENTER_PASSWORD = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        this.enterText = findViewById(R.id.password);
        this.searchPrefs = new SearchPrefs(this);
    }

    public void btnEnter(View view){
        if(ENTER_PASSWORD == this.enterText.getText().toString()){
            searchPrefs.appPassword = ENTER_PASSWORD;
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            Toast toast = Toast.makeText(this, "Неверный пароль", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 0, 160);
            toast.show();
        }
    }
}
