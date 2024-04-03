package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editText = findViewById(R.id.firstname);
        editText = findViewById(R.id.lastname);
        editText = findViewById(R.id.countryname);
        editText = findViewById(R.id.nickname);
        editText = findViewById(R.id.phonenumber);
        button = findViewById(R.id.btn_register);
        textView = findViewById(R.id.textView2);

        //string fo the user details
        String firstname, lastname, countryname, nickname;
        int phonenumber;
        //get  the strings and the int
        firstname = editText.getText().toString();
        lastname = editText.getText().toString();
        countryname = editText.getText().toString();
        nickname = editText.getText().toString();

        // string for the phone number
        String phoneNumberString = editText.getText().toString();
        int phoneNumber;

        try {
            phoneNumber = Integer.parseInt(phoneNumberString);
        } catch (NumberFormatException e) {
            // Handle the exception if the input is not a valid integer
            e.printStackTrace();
            phoneNumber = 0;

            //on click for the button
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });

            //on click for the textview
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}