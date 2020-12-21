package com.karol.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.karol.notepad.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button button2 = findViewById(R.id.btnCircle2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }

    private void openActivity1() {
        EditText editText = findViewById(R.id.edit_text);
        String text = editText.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }
}