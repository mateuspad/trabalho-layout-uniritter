package com.example.trabalhoactitivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TerceiraActivity extends AppCompatActivity {

    ImageView iconHome;
    ImageView iconLanguage;
    ImageView iconCalendar;
    ImageView iconInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        iconHome = findViewById(R.id.iconHome);
        iconLanguage = findViewById(R.id.iconLanguage);
        iconCalendar = findViewById(R.id.iconCalendar);
        iconInfo = findViewById(R.id.iconInfo);


        iconHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PrimeiraActivity.class);
                startActivity(i);
            }
        });

        iconLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), QuartaActivity.class);
                startActivity(i);
            }
        });

        iconCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), TerceiraActivity.class);
                startActivity(i);
            }
        });

        iconInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
                startActivity(i);
            }
        });
    }
}