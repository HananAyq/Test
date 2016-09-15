package com.example.hanan.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class register extends AppCompatActivity {

    EditText username ,email ,password ,repassword ,date ,gender ,phonenumber ,city;
    String sUserName ,sEmail ,sPassword ,sRePassword ,sDate ,sGender ,sPhoneNumber ,sCity;
    Button newuser;
    final List<EditText> editTexts = new ArrayList<>();

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }
    //for adding EditText elements in to an array list
    public void addEditTextsInToList(){

        username = (EditText) findViewById(R.id.edit_name);          editTexts.add(username);
        email = (EditText) findViewById(R.id.edit_email);            editTexts.add(email);
        password = (EditText) findViewById(R.id.edit_password1);     editTexts.add(password);
        repassword = (EditText) findViewById(R.id.edit_password2);   editTexts.add(repassword);
        date = (EditText) findViewById(R.id.edit_date);              editTexts.add(date);
        gender = (EditText) findViewById(R.id.edit_gender);          editTexts.add(gender);
        phonenumber = (EditText) findViewById(R.id.edit_phone);      editTexts.add(phonenumber);
        city = (EditText) findViewById(R.id.edit_city);              editTexts.add(city);

    }

    public void userReg(View view){
        sUserName = username.getText().toString();
        sEmail = email.getText().toString();
        sPassword = password.getText().toString();
        sRePassword = repassword.getText().toString();
        sDate = date.getText().toString();
        sGender = gender.getText().toString();
        sPhoneNumber = phonenumber.getText().toString();
        sCity = city.getText().toString();

        //call adding method
        addEditTextsInToList();
        newuser = (Button) findViewById(R.id.button_register);

        AlertDialog.Builder dialog = new AlertDialog.Builder(register.this);
        boolean dialogState = false ;
        for (int i = 0; i <editTexts.size() ; i++) {
            if( editTexts.get(i).getText().toString().equals("") ){
                dialogState = true ;
                dialog.setIcon(R.drawable.ic_folder_shared);
                dialog.setTitle(" خطأ ");
                dialog.setMessage(" يجب تعبئة جميع الخانات ");
                dialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                    }
                });
            }
            else {
                String method = "newRegister";
                RegisterTasks registerTasks = new RegisterTasks(this);
                registerTasks.execute(method ,sUserName ,sEmail ,sPassword ,sRePassword ,sDate ,sGender ,sPhoneNumber ,sCity);
                finish();
                startActivity(new Intent(this,opportunities.class));
            }
        } if(dialogState==true) dialog.show();

    }
}
