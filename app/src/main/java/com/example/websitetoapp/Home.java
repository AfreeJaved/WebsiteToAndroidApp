package com.example.websitetoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends AppCompatActivity {

   public EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=editText.getText().toString();

                if(!editText.getText().toString().isEmpty())
                {
                    Intent intent = new Intent(Home.this,MainActivity.class);
                    intent.putExtra("userUrl",url);
                    startActivity(intent);

//                    startActivity(new Intent(Home.this ,MainActivity.class));
                    editText.getText().clear();
                }

                else
                {
                    Toast.makeText(Home.this, "Please enter valid url", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}