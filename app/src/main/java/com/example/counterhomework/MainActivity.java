package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countView = findViewById(R.id.counter);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                countView.setVisibility(View.VISIBLE);
                countView.setText(savedInstanceState.getString("count"));
                countView.setVisibility(View.VISIBLE);
                counter = Integer.parseInt(savedInstanceState.getString("count"));
            }
        }

    }

    public void countUp(View view) {
        counter++;
        if(countView != null)
            countView.setText(Integer.toString(counter));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (countView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("count", countView.getText().toString());
        }
    }

}