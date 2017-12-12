package com.example.coolweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button creteDatabase=(Button)findViewById(R.id.btn);
        creteDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LitePal.getDatabase();
            }
        });

    }
}
