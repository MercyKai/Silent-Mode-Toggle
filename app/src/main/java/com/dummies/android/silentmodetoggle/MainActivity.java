package com.dummies.android.silentmodetoggle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isSilent = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView phoneOn = findViewById(R.id.phone_on);
        ImageView phoneSilent = findViewById(R.id.phone_silent);
        Button toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSilent) {
                    phoneOn.setVisibility(View.VISIBLE);
                    phoneSilent.setVisibility(View.GONE);
                    isSilent = false;
                } else {
                    phoneOn.setVisibility(View.GONE);
                    phoneSilent.setVisibility(View.VISIBLE);
                    isSilent = true;
                }
            }
        });
    }
}