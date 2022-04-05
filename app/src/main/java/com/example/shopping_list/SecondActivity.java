package com.example.shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    private Button replyCheese;
    private Button replyRice;
    private Button replyApples;
    private Button replyOranges;
    private Button replyGrapes;
    private Button replyMangos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        replyCheese = findViewById(R.id.buttonCheese);
        replyRice = findViewById(R.id.buttonRice);
        replyApples = findViewById(R.id.buttonApples);
        replyOranges = findViewById(R.id.buttonOranges);
        replyGrapes = findViewById(R.id.buttonGrapes);
        replyMangos = findViewById(R.id.buttonMangos);

    }

    public void returnReplyCheese(View view) {
        String reply = replyCheese.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyRice(View view) {
        String reply = replyRice.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void returnReplyApples(View view) {
        String reply = replyApples.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyOranges(View view) {
        String reply = replyOranges.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyGrapes(View view) {
        String reply = replyGrapes.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyMangos(View view) {
        String reply = replyMangos.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}