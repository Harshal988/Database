package com.example.lanovo.insert3;

import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText et,et2;
    Button btn;
    DbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.editText2);
        et2 = (EditText)findViewById(R.id.editText4);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            db.insert(et.getText().toString(),et2.getText().toString());
                Toast.makeText(MainActivity.this, "Data inserted", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
