package com.example.unitconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MilligramToGramOrVv extends AppCompatActivity {
    EditText input8_1;
    EditText input8_2;
    TextView value8_1;
    TextView value8_2;
    Button goBtn8_2;
    Button goBtn8_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_milligram_to_gram_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        input8_1 = findViewById(R.id.input8_1);
        input8_2 = findViewById(R.id.input8_2);
        value8_1 = findViewById(R.id.result_view8_1);
        value8_2 = findViewById(R.id.result_view8_2);
        goBtn8_1 = findViewById(R.id.firstBtn8_1);
        goBtn8_2 = findViewById(R.id.secondBtn8_2);

        goBtn8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input8_1.getText().toString().isEmpty()) {
                    Toast.makeText(MilligramToGramOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input1 = Double.parseDouble(input8_1.getText().toString());
                    milligramToGram(input1);
                }
            }
        });
        goBtn8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input8_2.getText().toString().isEmpty()) {
                    Toast.makeText(MilligramToGramOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input2 = Double.parseDouble(input8_2.getText().toString());
                    gramToMilligram(input2);
                }
            }
        });
    }

    private void milligramToGram(double input) {
        //conversion from milligram to gram
        double result = input / 1000;
        String format = String.format("%.2f", result);
        value8_1.setText(format + "g");
    }

    private void gramToMilligram(double input) {
        //conversion from gram to milligram
        double result = input * 1000;
        String format = String.format("%.2f", result);
        value8_2.setText(format + "mg");
    }
}