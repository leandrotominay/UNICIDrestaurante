 package com.example.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    private TextView txtView1;
    private TextView txtView2;
    private TextView txtView3;

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private EditText input5;
    private EditText input6;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         input1 = findViewById(R.id.input1);
         input2 = findViewById(R.id.input2);
         input3 = findViewById(R.id.input3);
         txtView1 = findViewById(R.id.txtView1); // taxa de serviço
         txtView2 = findViewById(R.id.txtView2); // valor total = consumo + couvert
         txtView3 = findViewById(R.id.txtView3); // valor por pessoa = valor total / input3

     }

     public void calcular(View view) {
         int valor1 = Integer.parseInt(input1.getText().toString());
         int valor2 = Integer.parseInt(input2.getText().toString());
         int valor3 = Integer.parseInt(input3.getText().toString());
         txtView1.setText(String.valueOf((valor1 + valor2) * 10 / 100));
         txtView2.setText(String.valueOf(valor1 + valor2));
         txtView3.setText(String.valueOf((valor1 + valor2) / valor3));

     }
}