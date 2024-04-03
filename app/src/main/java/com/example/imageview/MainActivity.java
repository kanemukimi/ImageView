package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.username);
        editText = findViewById(R.id.userpassword);
        textView = findViewById(R.id.textView1);
        button = findViewById(R.id.btn_login);

        // on click for the button login
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), image1.class);
                startActivity(intent);
                finish();
            }
        });

        //on click for the textview
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
                finish();
            }
        });

        //string of the email and password
        String username;
        String userpassword;
        //get the string of the email and the password
        username = editText.getText().toString();
        userpassword = editText.getText().toString();
        if (TextUtils.isEmpty(username)){
            Toast.makeText(this, "Email cant be empty!!", Toast.LENGTH_SHORT).show();
        }
        if (TextUtils.isEmpty(userpassword)){
            Toast.makeText(this, "Empty Password!!", Toast.LENGTH_SHORT).show();
        }
    }
}