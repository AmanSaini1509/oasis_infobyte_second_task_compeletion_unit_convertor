package com.example.unitconvertor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DistanceMeasurement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_distance_measurement);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnKm = findViewById(R.id.kToM);
        Button btnCm = findViewById(R.id.cToM);
        Button btnCk = findViewById(R.id.cToK);

        btnKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKm = new Intent(DistanceMeasurement.this, MeterToKilometerOrVv.class);
                startActivity(intentKm);
                finish();
            }
        });

        btnCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCm = new Intent(DistanceMeasurement.this, CentimeterToMeterOrVv.class);
                startActivity(intentCm);
                finish();
            }
        });

        btnCk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCk = new Intent(DistanceMeasurement.this, CentimeterToKilometerOrVv.class);
                startActivity(intentCk);
                finish();
            }
        });
    }
}