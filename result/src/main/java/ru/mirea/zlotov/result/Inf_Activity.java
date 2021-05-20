package ru.mirea.zlotov.result;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Inf_Activity extends AppCompatActivity {
    EditText editTextTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf_);
        editTextTitle = findViewById(R.id.edit_title);
    }

    public void sendResultOnMainActivityOnClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", editTextTitle.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}