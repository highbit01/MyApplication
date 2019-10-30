package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class choices extends AppCompatActivity {

    private Button smoke ;
    private Button moly ;
    private Button flash ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);
        final int flag = getIntent().getIntExtra("key1",0);
        smoke = (Button) findViewById(R.id.btn_smoke);
        moly = (Button) findViewById(R.id.btn_moly);
        flash = (Button) findViewById(R.id.btn_flash);

        smoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (flag){
                    case 1: Activity_dust2_smoke();
                            break;
                   /* case 2: Activity_inferno_smoke();
                        break;
                    case 3: Activity_mirage_smoke();
                        break;
                    case 4: Activity_cache_smoke();
                        break;*/
                }
            }
        });

    }
    public void Activity_dust2_smoke(){
        Intent intent1 = new Intent(this,dust_2_smoke.class);
        startActivity(intent1);
    }
}
