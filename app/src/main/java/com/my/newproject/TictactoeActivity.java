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
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;

public class TictactoeActivity extends Activity {
	
	
	private double a1 = 0;
	private double a2 = 0;
	private double a3 = 0;
	private double b1 = 0;
	private double b2 = 0;
	private double b3 = 0;
	private double c1 = 0;
	private double c2 = 0;
	private double c3 = 0;
	private double player_switch = 0;
	
	private LinearLayout linear1;
	private TextView textview2;
	private TextView textview1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private Button button1;
	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imageview7;
	private ImageView imageview8;
	private ImageView imageview9;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tictactoe);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button1 = (Button) findViewById(R.id.button1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview1.setImageResource(R.drawable.ic_crop_din_black);
				imageview2.setImageResource(R.drawable.ic_crop_din_black);
				imageview3.setImageResource(R.drawable.ic_crop_din_black);
				imageview4.setImageResource(R.drawable.ic_crop_din_black);
				imageview5.setImageResource(R.drawable.ic_crop_din_black);
				imageview6.setImageResource(R.drawable.ic_crop_din_black);
				imageview7.setImageResource(R.drawable.ic_crop_din_black);
				imageview8.setImageResource(R.drawable.ic_crop_din_black);
				imageview9.setImageResource(R.drawable.ic_crop_din_black);
				a1 = 0;
				a2 = 0;
				a3 = 0;
				b1 = 0;
				b2 = 0;
				b3 = 0;
				c1 = 0;
				c2 = 0;
				c3 = 0;
				player_switch = 0;
				textview1.setText("Status: ");
				textview2.setText("Player #1");
				imageview1.setEnabled(true);
				imageview2.setEnabled(true);
				imageview3.setEnabled(true);
				imageview4.setEnabled(true);
				imageview5.setEnabled(true);
				imageview6.setEnabled(true);
				imageview7.setEnabled(true);
				imageview8.setEnabled(true);
				imageview9.setEnabled(true);
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview1.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					a1 = 1;
					imageview1.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					a1 = -1;
					imageview1.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview2.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					a2 = 1;
					imageview2.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					a2 = -1;
					imageview2.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview3.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					a3 = 1;
					imageview3.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					a3 = -1;
					imageview3.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview4.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					b1 = 1;
					imageview4.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					b1 = -1;
					imageview4.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview5.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					b2 = 1;
					imageview5.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					b2 = -1;
					imageview5.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview6.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					b3 = 1;
					imageview6.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					b3 = -1;
					imageview6.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview7.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					c1 = 1;
					imageview7.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					c1 = -1;
					imageview7.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview8.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					c2 = 1;
					imageview8.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					c2 = -1;
					imageview8.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				imageview9.setEnabled(false);
				player_switch++;
				if ((player_switch % 2) == 1) {
					c3 = 1;
					imageview9.setImageResource(R.drawable.ic_close_black);
					textview2.setText("Player #2");
					_check();
				}
				else {
					c3 = -1;
					imageview9.setImageResource(R.drawable.ic_brightness_1_black);
					textview2.setText("Player #1");
					_check2();
				}
				if (player_switch == 9) {
					textview1.setText("Status: Game over!!");
				}
			}
		});
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _check () {
		if ((a1 + (a2 + a3)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((b1 + (b2 + b3)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((c1 + (c2 + c3)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a1 + (b1 + c1)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a2 + (b2 + c2)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a3 + (b3 + c3)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a1 + (b2 + c3)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a3 + (b2 + c1)) == 3) {
			textview1.setText("Status: Player 1 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
	}
	
	
	private void _check2 () {
		if ((a1 + (a2 + a3)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((b1 + (b2 + b3)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((c1 + (c2 + c3)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a1 + (b1 + c1)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a2 + (b2 + c2)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a3 + (b3 + c3)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a1 + (b2 + c3)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
		}
		if ((a3 + (b2 + c1)) == -3) {
			textview1.setText("Status: Player 2 win!!");
			textview2.setText("Player #");
			imageview1.setEnabled(false);
			imageview2.setEnabled(false);
			imageview3.setEnabled(false);
			imageview4.setEnabled(false);
			imageview5.setEnabled(false);
			imageview6.setEnabled(false);
			imageview7.setEnabled(false);
			imageview8.setEnabled(false);
			imageview9.setEnabled(false);
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
