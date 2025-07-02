package com.example.calculatortwo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView txtA , txtB,ans;
        Button Add , Sub , Mul , Div;


        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);

        Add = findViewById(R.id.add);
        Sub = findViewById(R.id.sub);
        Div = findViewById(R.id.div);
        Mul = findViewById(R.id.mul);

        ans = findViewById(R.id.ans);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = txtA.getText().toString();
                String str2 = txtB.getText().toString();

                if(str1.isEmpty() || str2.isEmpty())
                {
                    ans.setText("Please enter numbers");
                    return;
                }

                int a = Integer.parseInt(str1);
                int b = Integer.parseInt(str2);

                int sum = a+b;

                ans.setText(String.valueOf(sum));
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = txtA.getText().toString();
                String str2 = txtB.getText().toString();

                if(str1.isEmpty() || str2.isEmpty())
                {
                    ans.setText("Please enter numbers");
                    return;
                }

                int a = Integer.parseInt(str1);
                int b = Integer.parseInt(str2);
                int s = a-b;

                ans.setText(String.valueOf(s));
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = txtA.getText().toString();
                String str2 = txtB.getText().toString();

                if(str1.isEmpty() || str2.isEmpty())
                {
                    ans.setText("Please enter numbers");
                    return;
                }

                int a = Integer.parseInt(str1);
                int b = Integer.parseInt(str2);
                int m = a*b;

                ans.setText(String.valueOf(m));
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = txtA.getText().toString();
                String str2 = txtB.getText().toString();

                if(str1.isEmpty() || str2.isEmpty())
               {
                    ans.setText("Please enter numbers");
                    return;
                }

                int a = Integer.parseInt(str1);
                int b = Integer.parseInt(str2);
                int d = a/b;

                ans.setText(String.valueOf(d));
            }
        });



    }
}