package com.example.abc;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText provera;
    ImageView stol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        provera=findViewById(R.id.editIme);
        stol= (ImageView) findViewById(R.id.textView);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void provera(View view) {
        if (provera.getText().toString().equals("n")) {
            stol.setImageDrawable(getDrawable(R.drawable.nema));
        }

    }
}
