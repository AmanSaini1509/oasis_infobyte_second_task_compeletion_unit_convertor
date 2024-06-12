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

public class FahrenheitToKelvinOrVv extends AppCompatActivity {

    EditText value3_1;
    EditText value3_2;

    TextView result3_1;
    TextView result3_2;
    Button go3_1;
    Button go3_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fharenheit_to_kelvin_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        value3_1 = findViewById(R.id.input3_1);
        value3_2 = findViewById(R.id.input3_2);
        result3_1 = findViewById(R.id.result_view3_1);
        result3_2 = findViewById(R.id.result_view3_2);
        go3_1 = findViewById(R.id.firstBtn3_1);
        go3_2 = findViewById(R.id.secondBtn3_2);

        go3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value3_1.getText().toString().isEmpty()) {
                    Toast.makeText(FahrenheitToKelvinOrVv.this, "Please Enter a Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double input1 = Double.parseDouble(value3_1.getText().toString());
                    fahrenheitToKelvin(input1);
                }
            }
        });

        go3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value3_2.getText().toString().isEmpty()) {
                    Toast.makeText(FahrenheitToKelvinOrVv.this, "Please Enter a Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double input2 = Double.parseDouble(value3_2.getText().toString());
                    kelvinToFahrenheit(input2);
                }
            }
        });
    }

    public void fahrenheitToKelvin(double input1){
        // logic for converting from Fahrenheit to Kelvin
        double result = (input1 - 32) * 5/9 + 273.15;
        String format = String.format("%.2f", result);
        result3_1.setText(format + "°F");
    }

    public void kelvinToFahrenheit(double input2){
        // logic for converting from Kelvin to Fahrenheit
        double result = (input2 - 273.15) * 9/5 + 32;
        String format = String.format("%.2f", result);
        result3_2.setText(format + "°C");
    }
}