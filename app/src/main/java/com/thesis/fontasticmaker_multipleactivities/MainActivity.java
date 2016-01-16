package com.thesis.fontasticmaker_multipleactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagebutton_create();
        imagebutton_help();
        imagebutton_about();
    }


    //BUTTONS, IMAGE BUTTONS
    protected void imagebutton_create(){
        ImageButton createFont = (ImageButton) findViewById(R.id.imagebutton_create);
        createFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent("com.thesis.fontasticmaker_multipleactivities.DrawingActivity");
                startActivity(intent);
            }
        });
    }
    protected void imagebutton_help(){
        ImageButton help = (ImageButton) findViewById(R.id.imagebutton_help);
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent;
                intent = new Intent("com.thesis.fontasticmaker_multipleactivities.HelpActivity");
                startActivity(intent);
            }
        });
    }
    protected void imagebutton_about(){
        ImageButton about = (ImageButton) findViewById(R.id.imagebutton_about);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent;
                intent = new Intent("com.thesis.fontasticmaker_multipleactivities.AboutActivity");
                startActivity(intent);
            }
        });
    }


}