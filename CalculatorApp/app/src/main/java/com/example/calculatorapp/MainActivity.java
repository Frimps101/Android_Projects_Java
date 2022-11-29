package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumber, secondNumber, operator;
    private TextView answer;
    private Button calcButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);

        operator = findViewById(R.id.operator);
        answer = findViewById(R.id.answer);
    }

    public void calculate(View view){
        int firstNum = Integer.parseInt(firstNumber.getText().toString());
        int secondNum = Integer.parseInt(secondNumber.getText().toString());
        String op = operator.getText().toString();
        int result;


    }
}