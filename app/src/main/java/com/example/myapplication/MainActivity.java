package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button dust ;
    private Button inferno ;
    private Button mirage ;
    private Button cache ;

    public int flag_map = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dust = (Button) findViewById(R.id.btn_dust_2);
        inferno = (Button) findViewById(R.id.btn_inferno);
        mirage = (Button) findViewById(R.id.btn_mirage);
        cache = (Button) findViewById(R.id.btn_cache);

        dust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag_map = 1;
                openActivity_choices();
            }
        });
        inferno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag_map = 2;
                openActivity_choices();
            }
        });
        mirage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag_map = 3;
                openActivity_choices();
            }
        });
        cache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag_map = 4;
                openActivity_choices();
            }
        });


    }
    public void openActivity_choices(){
        Intent intent = new Intent(this,choices.class);
        intent.putExtra("key1",flag_map);
        startActivity(intent);
    }
}
