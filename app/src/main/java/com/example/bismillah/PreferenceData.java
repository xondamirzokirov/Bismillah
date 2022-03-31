package com.example.bismillah;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceData {

    Context context;

    public PreferenceData(Context context) {
        this.context = context;
    }

    public void setShared (String var,String data){
        SharedPreferences preferences =  context.getSharedPreferences("Shared",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(var, data);
        editor.apply();

    }

    public  String getShared (String var){
        SharedPreferences preferences = context.getSharedPreferences("Shared",Context.MODE_PRIVATE);
        return  preferences.getString(var,"");
    }
}

