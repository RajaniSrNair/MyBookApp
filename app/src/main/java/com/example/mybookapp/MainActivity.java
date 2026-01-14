package com.example.mybookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTitle, editAuthor, editYear;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTitle = findViewById(R.id.editTitle);
        editAuthor = findViewById(R.id.editAuthor);
        editYear = findViewById(R.id.editYear);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = editTitle.getText().toString();
                String author = editAuthor.getText().toString();
                String year = editYear.getText().toString();

                Book book = new Book(title, author, year);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("book", book);
                startActivity(intent);
            }
        });
    }
}
