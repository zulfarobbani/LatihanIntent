package com.example.zulfarobbani_latihanintentdata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class orderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        TextView t= (TextView) findViewById(R.id.text_viewnama);
        TextView a= (TextView) findViewById(R.id.text_viewalamat);
        TextView p= (TextView) findViewById(R.id.text_vieworder);
        Bundle bundle =getIntent().getExtras();
        String s=bundle.getString("name");
        String i=bundle.getString("alamat");
        String o=bundle.getString("pesan");
        t.setText(s);
        a.setText(i);
        p.setText(o);
    }
}
