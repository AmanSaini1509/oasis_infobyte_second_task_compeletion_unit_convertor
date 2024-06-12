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

public class CentimeterToKilometerOrVv extends AppCompatActivity {

    EditText input6_1;
    EditText input6_2;
    TextView value6_1;
    TextView value6_2;
    Button goBtn6_1;
    Button goBtn6_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_centimeter_to_kilometer_or_vv);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        input6_1 = findViewById(R.id.input6_1);
        input6_2 = findViewById(R.id.input6_2);
        value6_1 = findViewById(R.id.result_view6_1);
        value6_2 = findViewById(R.id.result_view6_2);
        goBtn6_1 = findViewById(R.id.firstBtn6_1);
        goBtn6_2 = findViewById(R.id.secondBtn6_2);

        goBtn6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input6_1.getText().toString().isEmpty()){
                    Toast.makeText(CentimeterToKilometerOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    double input1 = Double.parseDouble(input6_1.getText().toString());
                    centimeterToKilometer(input1);
                }
            }
        });
        goBtn6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input6_2.getText().toString().isEmpty()){
                    Toast.makeText(CentimeterToKilometerOrVv.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
            }
                else {
                    double input2 = Double.parseDouble(input6_2.getText().toString());
                    kilometerToCentimeter(input2);
                }
            }
            });
    }
    private void centimeterToKilometer(double input){
        double result = input / 100000;
        String format = String.format("%.2f", result);
        value6_1.setText(format + " km");
    }

    private void kilometerToCentimeter(double input){
        double result = input * 100000;
        String format = String.format("%.2f", result);
        value6_2.setText(format + " cm");
    }
}