package com.example.latihan2_if6_10119242_nadyanurulawaliyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VeryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_very);
        Button verify = findViewById(R.id.veryacc);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(VeryActivity.this,ActivityHome.class);
                startActivity(a);
            }
        });

    }
}