package com.example.byan11rpl012019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.byan11rpl012019.MainActivity;
import com.example.byan11rpl012019.MainMenu;

public class Controlclass extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("username", "").isEmpty() ||
                sharedPreferences.getString("username", "").equalsIgnoreCase("")){
            //login dulu
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }else{
            startActivity(new Intent(getApplicationContext(), MainMenu.class));
            finish();
        }
    }
}
