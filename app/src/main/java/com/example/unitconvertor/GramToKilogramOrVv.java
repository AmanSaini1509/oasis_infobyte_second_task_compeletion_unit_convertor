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

public class GramToKilogramOrVv extends AppCompatActivity {
    EditText input7_1;
    EditText input7_2;
    TextView value7_1;
    TextView value7_2;
    Button goBtn7_2;
    Button goBtn7_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gram_to_kilogram_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        input7_1 = findViewById(R.id.input7_1);
        input7_2 = findViewById(R.id.input7_2);
        value7_1 = findViewById(R.id.result_view7_1);
        value7_2 = findViewById(R.id.result_view7_2);
        goBtn7_2 = findViewById(R.id.secondBtn7_2);
        goBtn7_1 = findViewById(R.id.firstBtn7_1);

        goBtn7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input7_1.getText().toString().isEmpty()) {
                    Toast.makeText(GramToKilogramOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input1 = Double.parseDouble(input7_1.getText().toString());
                    gramToKilogram(input1);
                }
            }
        });
        goBtn7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input7_2.getText().toString().isEmpty()) {
                    Toast.makeText(GramToKilogramOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input2 = Double.parseDouble(input7_2.getText().toString());
                    kilogramToGram(input2);
                }
            }
        });
    }

    private void gramToKilogram(double input1) {
        //conversion from gram to kilogram
        double result = input1 / 1000;
        String format = String.format("%.2f", result);
        value7_1.setText(format + " kg");
    }

    private void kilogramToGram(double input2) {
        //conversion from kilogram to fram
        double result = input2 * 1000;
        String format = String.format("%.2f", result);
        value7_2.setText(format + " g");
    }
}