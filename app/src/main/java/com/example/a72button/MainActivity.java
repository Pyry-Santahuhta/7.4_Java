package com.example.a72button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText inputText;
    TextView newText;
    String textToSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Scanner scan = new Scanner(System.in);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = (EditText) findViewById(R.id.editText);
        newText = (TextView) findViewById(R.id.userInput);
        inputText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                newText.setText(inputText.getText().toString());
            }
        });
    }
    public void testMethod (View v){
        System.out.println("Hello world!");





    }
}
