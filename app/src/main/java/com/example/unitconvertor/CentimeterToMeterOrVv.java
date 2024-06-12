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

public class CentimeterToMeterOrVv extends AppCompatActivity {

    EditText input4_1;
    EditText input4_2;
    TextView value4_1;
    TextView value4_2;
    Button goBtn4_1;
    Button goBtn4_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_centimeter_to_meter_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        input4_1 = findViewById(R.id.input4_1);
        input4_2 = findViewById(R.id.input4_2);
        value4_1 = findViewById(R.id.result_view4_1);
        value4_2 = findViewById(R.id.result_view4_2);
        goBtn4_1 = findViewById(R.id.firstBtn4_1);
        goBtn4_2 = findViewById(R.id.secondBtn4_2);

        goBtn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input4_1.getText().toString().isEmpty()) {
                    Toast.makeText(CentimeterToMeterOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input1 = Double.parseDouble(input4_1.getText().toString());
                    centimeterToMeter(input1);
                }
            }
        });

        goBtn4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input4_2.getText().toString().isEmpty()){
                    Toast.makeText(CentimeterToMeterOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input2 = Double.parseDouble(input4_2.getText().toString());
                    meterToCentimeter(input2);
                }
            }
        });
    }
    private void centimeterToMeter(double input) {
        double result = input / 100;
        String format = String.format("%.2f", result);
        value4_1.setText(format + " m");
    }

    private void meterToCentimeter(double input) {
        double result = input * 100;
        String format = String.format("%.2f", result);
        value4_2.setText(format + " cm");
    }
}