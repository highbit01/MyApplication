package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dust_2_smoke extends AppCompatActivity {
    private Button smk_long;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dust_2_smoke);
        smk_long = (Button) findViewById(R.id.btn_dust2_smk_long);

        smk_long.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_gif();
            }
        });
    }
    public void openActivity_gif(){
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("gif","ezgif");

        startActivity(intent);
    }
}
