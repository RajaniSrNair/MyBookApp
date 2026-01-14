package com.example.mybookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textBookDetails;
    Button btnTakePhoto, btnNext;
    private static final int CAMERA_REQUEST = 1888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textBookDetails = findViewById(R.id.textBookDetails);
        btnTakePhoto = findViewById(R.id.btnTakePhoto);
        btnNext = findViewById(R.id.btnNext);

        // 1️⃣ Get Book object from MainActivity
        Book book = (Book) getIntent().getSerializableExtra("book");
        if(book != null){
            textBookDetails.setText(
                    "Title: " + book.getTitle() + "\n" +
                            "Author: " + book.getAuthor() + "\n" +
                            "Year: " + book.getYear()
            );
        }

        // 2️⃣ Take Photo button
        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });

        // 3️⃣ Next button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    // 4️⃣ Handle result of camera intent
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CAMERA_REQUEST && resultCode == RESULT_OK){
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            ImageView img = new ImageView(this);
            img.setImageBitmap(photo);
            // Add photo below the buttons
            LinearLayout layout = (LinearLayout) findViewById(R.id.textBookDetails).getParent();
            layout.addView(img);
        }
    }
}
