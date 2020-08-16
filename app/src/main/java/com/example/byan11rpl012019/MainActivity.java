package com.example.byan11rpl012019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    TextView tvnama1;
    EditText txtuser;
    EditText txtpass;
    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pref = getSharedPreferences("Login", MODE_PRIVATE);
        tvnama1 = findViewById(R.id.tvnama1);
        txtuser = findViewById(R.id.username);
        txtpass = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtuser.getText().toString().equalsIgnoreCase("Admin")
                        && txtpass.getText().toString().equalsIgnoreCase("Admin")){

                    editor = pref.edit();
                    editor.putString("Username", txtuser.getText().toString());
                    editor.putString("Status","login");
                    editor.apply();

                    startActivity(new Intent(getApplicationContext(), MainMenu.class));
                    finish();


                }
            }
        });

    }
}