package com.brycendorsay.counter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button increment, reset;
	TextView resultField;
	private static int value = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		increment = (Button)findViewById(R.id.increment_button);
		reset = (Button)findViewById(R.id.reset_button);
		resultField = (TextView)findViewById(R.id.result_field);
		
		resultField.setText("" + value);

	    increment.setOnClickListener(
	        new View.OnClickListener() {
	            public void onClick(View view) {
	            	resultField.setText("" + ++value);
	            }
	        });
	    
	    reset.setOnClickListener(
		        new View.OnClickListener() {
		            public void onClick(View view) {
		            	value = 0;
		            	resultField.setText("" + value);
		            }
		        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
