package com.my.newproject;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class GuessnumberActivity extends Activity {
	
	
	private double guessnumber = 0;
	private double inputNumber = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView textview1;
	private TextView answer;
	private EditText input;
	private Button guessb;
	private Button startb;
	private Button stopb;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.guessnumber);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview1 = (TextView) findViewById(R.id.textview1);
		answer = (TextView) findViewById(R.id.answer);
		input = (EditText) findViewById(R.id.input);
		guessb = (Button) findViewById(R.id.guessb);
		startb = (Button) findViewById(R.id.startb);
		stopb = (Button) findViewById(R.id.stopb);
		
		guessb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (input.getText().toString().length() > 0) {
					inputNumber = Double.parseDouble(input.getText().toString());
					if (guessnumber == inputNumber) {
						answer.setText(String.valueOf((long)(guessnumber)));
						SketchwareUtil.showMessage(getApplicationContext(), "Correct");
						guessb.setEnabled(false);
						stopb.setEnabled(false);
						input.setEnabled(false);
					}
					else {
						if (guessnumber > inputNumber) {
							SketchwareUtil.showMessage(getApplicationContext(), "Bigger than ".concat(String.valueOf((long)(inputNumber))));
						}
						if (inputNumber > guessnumber) {
							SketchwareUtil.showMessage(getApplicationContext(), "Less than ".concat(String.valueOf((long)(inputNumber))));
						}
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Please enter a number");
				}
			}
		});
		
		startb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				guessb.setEnabled(true);
				stopb.setEnabled(true);
				input.setEnabled(true);
				answer.setText("?");
				guessnumber = SketchwareUtil.getRandom((int)(0), (int)(9));
			}
		});
		
		stopb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				answer.setText(String.valueOf((long)(guessnumber)));
				guessb.setEnabled(false);
				input.setEnabled(false);
				input.setText("");
			}
		});
	}
	private void initializeLogic() {
		guessb.setEnabled(false);
		stopb.setEnabled(false);
		input.setEnabled(false);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
