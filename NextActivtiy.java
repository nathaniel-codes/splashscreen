package com.nathantechs.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NextActivtiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_next_activtiy);


        Button prevbtn = findViewById(R.id.prev);

        prevbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){

                Intent txtintent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(txtintent);

            }
        });

    }
}