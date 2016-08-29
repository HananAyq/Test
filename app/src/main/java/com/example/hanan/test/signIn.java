package com.example.hanan.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        final Button next = (Button) findViewById(R.id.newUser);
        EditText edit = (EditText) findViewById(R.id.username);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent newUser = new Intent(signIn.this,register.class);
             startActivity(newUser);
             }
           }
        );
    }
}
