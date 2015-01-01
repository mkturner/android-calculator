package org.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText operand1, operand2;
	Button btnPlus, btnSubtract, btnMultiply, btnDivide;
	TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Setup Fields from main screen
		
		// Operand Fields
		operand1 = (EditText) findViewById(R.id.editOperand1);
		operand2 = (EditText) findViewById(R.id.editOperand2);
		
		// Operator Buttons
		btnPlus = (Button) findViewById(R.id.btnPlus);
		btnSubtract = (Button) findViewById(R.id.btnSubtract);
		btnMultiply = (Button) findViewById(R.id.btnMultiply);
		btnDivide = (Button) findViewById(R.id.btnDivide);
		
		// Result Field
		result = (TextView) findViewById(R.id.textResult);
		
		//Add functionality to process result
		btnPlus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float addResult = oper1 + oper2;
				result.setText(Float.toString(addResult));
				
			}
		});
		
		btnSubtract.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float subtractResult = oper1 - oper2;
				result.setText(Float.toString(subtractResult));
				
			}
		});

		btnMultiply.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float multiplyResult = oper1 * oper2;
				result.setText(Float.toString(multiplyResult));
				
			}
		});

		btnDivide.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				
				float divideResult = oper1 / oper2;
				result.setText(Float.toString(divideResult));
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
