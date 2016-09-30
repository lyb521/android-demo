package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends Activity {

	 private final int SPLASH_DISPLAY_LENGHT = 3000; //延迟三秒 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				toMain();
			}
		}, SPLASH_DISPLAY_LENGHT);
		
	}
	
	
    public void toMain(){
    	Intent intent =new Intent();
    	intent.putExtra("test_string", "这是从启动画面传过来的值");
        intent.setClass(Splash.this, MainActivity.class);
        Splash.this.startActivity(intent);
        Splash.this.finish();
    }
}
