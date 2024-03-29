package com.example.medi.mediproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PromptBottleActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt_bottle);

        buttonPrev = (Button) findViewById(R.id.btnPrev);
        buttonNext = (Button) findViewById(R.id.btnNext);
    }

    public void onPrevClick(View view) {
        Intent intent = new Intent(PromptBottleActivity.this, ContainerSelectActivity.class);
        startActivity(intent);
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(PromptBottleActivity.this, RecordUrineActivity.class);
        startActivity(intent);
    }
}
