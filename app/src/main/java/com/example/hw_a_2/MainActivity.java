package com.example.hw_a_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView monitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitor = findViewById(R.id.txt);
        EditText button1 = findViewById(R.id.text1);
        EditText button2 = findViewById(R.id.text2);
        EditText button3 =  findViewById(R.id.text3);
        Button addition = findViewById(R.id.btn);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first= Double.parseDouble(button1.getText().toString());
                double second= Double.parseDouble(button2.getText().toString());
                double third= Double.parseDouble(button3.getText().toString());
                double sum = first+second+third;
                String bumaga = String.valueOf(sum);

                monitor.setText(bumaga);

            }
        });
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String ekran = savedInstanceState.getString("key");
        monitor.setText(ekran);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key" , monitor.getText().toString());
    }
}