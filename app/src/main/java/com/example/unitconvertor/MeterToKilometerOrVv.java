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

public class MeterToKilometerOrVv extends AppCompatActivity {

    EditText input5_1;
    EditText input5_2;
    TextView value5_1;
    TextView value5_2;
    Button goBtn5_1;
    Button goBtn5_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_meter_to_kilometer_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        input5_1 = findViewById(R.id.input5_1);
        input5_2 = findViewById(R.id.input5_2);
        value5_1 = findViewById(R.id.result_view5_1);
        value5_2 = findViewById(R.id.result_view5_2);
        goBtn5_1 = findViewById(R.id.firstBtn5_1);
        goBtn5_2 = findViewById(R.id.secondBtn5_2);

        goBtn5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input5_1.getText().toString().isEmpty()) {
                    Toast.makeText(MeterToKilometerOrVv.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input1 = Double.parseDouble(input5_1.getText().toString());
                    meterToKilometer(input1);
                }
            }
        });

        goBtn5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input5_2.getText().toString().isEmpty()) {
                    Toast.makeText(MeterToKilometerOrVv.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input2 = Double.parseDouble(input5_2.getText().toString());
                    kilometerToMeter(input2);
                }
            }
        });
    }

    private void meterToKilometer(double input) {
        // conversion from meter to kilometer
        double result = input * 0.001;
        String format = String.format("%.2f", result);
        value5_1.setText(format + " km");
    }

    private void kilometerToMeter(double input) {
        //conversion from kilometer to meter
        double result = input * 1000;
        String format = String.format("%.2f", result);
        value5_2.setText(format + " m");
    }

}