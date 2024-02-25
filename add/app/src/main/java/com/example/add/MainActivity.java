package com.example.add;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextNumber1=findViewById(R.id.e1);
        EditText editTextNumber2=findViewById(R.id.e2);
        Button btn=findViewById(R.id.button);
        TextView txt=findViewById(R.id.Result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=editTextNumber1.getText().toString();
                String num2=editTextNumber2.getText().toString();
                double nums1=Double.parseDouble(num1);
                double nums2=Double.parseDouble(num2);
                double result=nums1+nums2;
                txt.setText("Result:"+result);
            }
        });
    }
}