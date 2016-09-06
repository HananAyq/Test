package com.example.hanan.test;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
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
    Button newuser;
    final List<EditText> editTexts = new ArrayList<>();

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
      //call adding method
        addEditTextsInToList();
        newuser = (Button) findViewById(R.id.button_register);

  //temporary textView only for testing
        text = (TextView) findViewById(R.id.textView);

        newuser.setOnClickListener(new View.OnClickListener(){
        @Override
         public void onClick(View view){
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

   //also for testing
           else {
             String user = username.getText().toString();
             SharedPreferences saveData = getPreferences(MODE_PRIVATE);
             SharedPreferences.Editor editor = saveData.edit();
             editor.putString("username",user);
             editor.apply();

             SharedPreferences getData = getPreferences(MODE_PRIVATE);
             text.setText(getData.getString("username",""));

           }
          } if(dialogState==true) dialog.show();
         }
        });

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
}
