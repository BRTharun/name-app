package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.multiscreen.MainActivity2;
import com.example.multiscreen.R;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName4;
    public  static final String EXTRA_NAME ="com.example.multiscreen.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        Toast.makeText(this, "opening 2nd screen", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        String nameText = editTextTextPersonName4.getText().toString();
        intent.putExtra(EXTRA_NAME,nameText);
        startActivity(intent);
    }
}