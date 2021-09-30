package com.example.standardtool;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.NoSuchElementException;

public class MainActivity extends AppCompatActivity {

    String a,b;
    Button btnAdd, btnSub, btnMul, btnDiv;
    double result, x,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        EditText var1 = findViewById(R.id.editTextTextPersonName2);
        EditText var2 = findViewById(R.id.editTextTextPersonName3);

        btnAdd = findViewById(R.id.sum);
        btnDiv = findViewById(R.id.divide);
        btnMul = findViewById(R.id.multiply);
        btnSub = findViewById(R.id.subtract);

        //더하기
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){

                try {
                    x = Double.valueOf(var1.getText().toString());
                    y = Double.valueOf(var2.getText().toString());

                    result = x + y;
                    textView.setText(result+ "");

                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력해 주세요!.", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }


        });
        //빼기
        btnSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                try {
                    x = Double.valueOf(var1.getText().toString());
                    y = Double.valueOf(var2.getText().toString());

                    result = x - y;
                    textView.setText(result + "");

                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력해 주세요!.", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        //곱하기
        btnMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                try {
                    x = Double.valueOf(var1.getText().toString());
                    y = Double.valueOf(var2.getText().toString());

                    result = x * y;
                    textView.setText(result + "");

                } catch (NumberFormatException e)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력해 주세요!.", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        //나누기
        btnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                try {
                   x = Double.valueOf(var1.getText().toString());
                   y = Double.valueOf(var2.getText().toString());

                   if(y==0) {
                       textView.setText("0으로는 나눌 수 없습니다.");
                       Toast.makeText(getApplicationContext(), "0으로는 나눌 수 없습니다!", Toast.LENGTH_SHORT).show();
                   }
                   else if( y != 0) {
                       result = x / y;
                       textView.setText(result + "");

                   }


                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(getApplicationContext(), "값을 입력해 주세요!", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }
            }
        });







    }
}