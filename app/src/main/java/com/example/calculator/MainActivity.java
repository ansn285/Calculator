package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    android.widget.TextView result;
    EditText number1, number2;
    Button add, subtract, multiply, divide;

    float calculated;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply =(Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                calculated = num1 + num2;

                result.setText(String.valueOf(num1) +"+" + String.valueOf(num2) + "=" +String.valueOf(calculated));

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                calculated = num1 - num2;

                result.setText(String.valueOf(calculated));

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                calculated = num1 * num2;

                result.setText(String.valueOf(calculated));

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                calculated = num1 / num2;

                result.setText(String.valueOf(calculated));

            }
        });

    }
}
