package com.example.standardtool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int one[] = new int [4];
        one[0] = 10;
        one[3] = 20;

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                button.setVisibility(View.GONE);


      /*  Toast.makeText(getApplicationContext(), "토스트메시지", Toast.LENGTH_SHORT).show();
                *//*for(int i = 0; i < one.length; i++)
                {
                    Toast.makeText(getApplicationContext(),Integer.toString(one[i]), Toast.LENGTH_LONG).show();
                }*//*
        for (int str : one) {
            try {
                Toast.makeText(getApplicationContext(), String.valueOf(str), Toast.LENGTH_SHORT).show();
            }
            catch (Exception e)
            {
            e.printStackTrace();
            }
        }*/
            }
        });



    /*    int two[][] = new int[2][3];
        two[0][0] =100;
        two[2][3] = 200;*/


    }
}