package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textview);
        Intent intent = this.getIntent();
        textview.setText(intent.getStringExtra("test_string"));
        Toast.makeText(this, intent.getStringExtra("test_string"), Toast.LENGTH_LONG).show();
    }
}
