package com.example.mybookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    Button btnOpenWebsite, btnDialNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnOpenWebsite = findViewById(R.id.btnOpenWebsite);
        btnDialNumber = findViewById(R.id.btnDialNumber);

        // 1️⃣ Open a website in the browser
        btnOpenWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.example.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        // 2️⃣ Open phone dialer with a number
        btnDialNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel:1234567890");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(dialIntent);
            }
        });
    }
}
