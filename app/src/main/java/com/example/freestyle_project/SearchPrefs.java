package com.example.freestyle_project;

import android.content.Context;
import android.content.SharedPreferences;

public class SearchPrefs {
    private Context context;
    private String PREFS_FILENAME = "mysettings";
    public String APP_PASSWORD = "APP_PASSWORD";
    public SharedPreferences prefs;
    public String appPassword;

    SearchPrefs(Context context){
        this.context = context;
        this.prefs = context.getSharedPreferences(PREFS_FILENAME, 0);
    }

    public String getPassword(){
        return this.prefs.getString(APP_PASSWORD, "");
    }

    public void setPassword(String value){
        this.prefs.edit().putString(APP_PASSWORD, value).apply();
    }

}
