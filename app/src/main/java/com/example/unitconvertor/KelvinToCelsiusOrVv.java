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

public class KelvinToCelsiusOrVv extends AppCompatActivity {
    EditText value1;
    EditText value2;

    TextView result1;
    TextView result2;
    Button go1;
    Button go2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kelvin_to_celsius_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        value1 = findViewById(R.id.input1);
        value2 = findViewById(R.id.input2);

        result1 = findViewById(R.id.result_view);
        result2 = findViewById(R.id.result_view2);
        go1 = findViewById(R.id.firstBtn);
        go2 = findViewById(R.id.secondBtn);

        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value1.getText().toString().isEmpty()) {
                    Toast.makeText(KelvinToCelsiusOrVv.this, "Please Enter a Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double input1 = Double.parseDouble(value1.getText().toString());
                    kelvinToCelsius(input1);
                }
            }
        });

        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value2.getText().toString().isEmpty()) {
                    Toast.makeText(KelvinToCelsiusOrVv.this, "Please Enter a Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double input2 = Double.parseDouble(value2.getText().toString());
                    celsiusToKelvin(input2);
                }
            }
        });
    }

    public void kelvinToCelsius(double input1){
        // logic for converting from Kelvin to Celsius
        double result = input1 - 273.15;
        String format = String.format("%.2f", result);
        result1.setText(format + "°C");
    }

    public void celsiusToKelvin(double input2){
        // logic for converting from Celsius to Kelvin
        double result = input2 + 273.15;
        String format = String.format("%.2f", result);
        result2.setText(format + "°K");
    }
}