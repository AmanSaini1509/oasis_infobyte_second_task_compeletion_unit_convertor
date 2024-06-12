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

public class MilligramToKilogramOrVv extends AppCompatActivity {
    EditText input9_1;
    EditText input9_2;
    TextView value9_1;
    TextView value9_2;
    Button goBtn9_2;
    Button goBtn9_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_milligram_to_kilogram_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        input9_1 = findViewById(R.id.input9_1);
        input9_2 = findViewById(R.id.input9_2);
        value9_1 = findViewById(R.id.result_view9_1);
        value9_2 = findViewById(R.id.result_view9_2);
        goBtn9_2 = findViewById(R.id.secondBtn9_2);
        goBtn9_1 = findViewById(R.id.firstBtn9_1);

        goBtn9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input9_1.getText().toString().isEmpty()) {
                    Toast.makeText(MilligramToKilogramOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input1 = Double.parseDouble(input9_1.getText().toString());
                    milligramToKilogram(input1);
                }
            }
        });
        goBtn9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input9_2.getText().toString().isEmpty()) {
                    Toast.makeText(MilligramToKilogramOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input2 = Double.parseDouble(input9_2.getText().toString());
                    kilogramToMilligram(input2);
                }
            }
        });
    }

    private void milligramToKilogram(double input) {
        //conversion from milligram to kilogram
        double result = input / 1000000;
        String format = String.format("%.8f", result);
        value9_1.setText(format + " kg");
    }
    private void kilogramToMilligram(double input) {
        // conversion from kilogram to milligram
        double result = input * 1000000;
        String format = String.format("%.9f", result);
        value9_2.setText(format + " mg");
    }


}