package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pl.droidsonroids.gif.GifImageButton;
import pl.droidsonroids.gif.GifImageView;

public class Activity2 extends AppCompatActivity {
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        String gif_name = getIntent().getStringExtra("gif");
        System.out.println(gif_name);
        int rh=this.getResources().getIdentifier(gif_name, "drawable", this.getPackageName());


        setContentView(R.layout.activity_2);
        GifImageView gib = findViewById(R.id.action_gif);
        gib.setImageResource(rh);

        button2 = (Button) findViewById(R.id.btn_back);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity1();
            }
        });
    }

    public void activity1(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
