package com.example.alertbox;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bu = new AlertDialog.Builder(MainActivity.this);
                bu.setTitle("Alert title");
                bu.setMessage("This is an Example Alert Dialog");
                bu.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "You Clicked Ok", Toast.LENGTH_SHORT).show();
                    }
                });
                bu.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "You Clicked Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = bu.create();
                alertDialog.show();
            }
        });

    }
}