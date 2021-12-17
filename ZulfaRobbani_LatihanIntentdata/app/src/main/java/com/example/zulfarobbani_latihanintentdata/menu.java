package com.example.zulfarobbani_latihanintentdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity implements View.OnClickListener {
    ImageButton gofood;
    ImageButton gomart;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        gofood = (ImageButton) findViewById(R.id.gofood);
        gofood.setOnClickListener(this);
        gomart = (ImageButton) findViewById(R.id.gomart);
        gomart.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.gofood:
                Intent explicit = new Intent(menu.this, gofoodActivity.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }

    }

