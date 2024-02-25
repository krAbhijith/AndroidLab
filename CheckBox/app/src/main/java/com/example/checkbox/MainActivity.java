package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox cItem1 = findViewById(R.id.c1);
        CheckBox cItem2 = findViewById(R.id.c2);
        CheckBox cItem3 = findViewById(R.id.c3);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder st = new StringBuilder("Selected items : ");

                if(cItem1.isChecked()){
                    st.append(cItem1.getText());
                }
                if(cItem2.isChecked()){
                    st.append(cItem2.getText());
                }
                if(cItem3.isChecked()){
                    st.append(cItem3.getText());
                }

                Toast.makeText(MainActivity.this, st.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}