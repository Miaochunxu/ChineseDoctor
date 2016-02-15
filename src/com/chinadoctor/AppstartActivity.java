package com.chinadoctor;

import com.activity.LoginActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

public class AppstartActivity extends Activity {
	boolean isFirstIn = false;
	private static final int GO_HOME = 1000;
	private static final int GO_GUIDE = 1001;
	private static final String SHAREDPREFERENCES_NAME = "first_pref";
	private static final long SPLASH_DELAY_MILLIS = 3000;

	private ImageView imageView;

	@SuppressLint("HandlerLeak")
	private Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case GO_HOME:
				goHome();
				break;
			case GO_GUIDE:
				goGuide();
				break;
			}
			super.handleMessage(msg);
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_appstart);
		init();
	}

	/* 判断是否是第一次安装软件 */
	private void init() {

		imageView = (ImageView) findViewById(R.id.img_appstart);

		SharedPreferences preferences = getSharedPreferences(
				SHAREDPREFERENCES_NAME, MODE_PRIVATE);
		isFirstIn = preferences.getBoolean("isFirstIn", true);
		if (!isFirstIn) {
			mHandler.sendEmptyMessageDelayed(GO_HOME, SPLASH_DELAY_MILLIS);
		} else {
			mHandler.sendEmptyMessageDelayed(GO_GUIDE, SPLASH_DELAY_MILLIS);
		}
	}

	/* 如果不是第一次启动应用,进入主界面 */
	private void goHome() {
		Intent intent = new Intent(AppstartActivity.this, LoginActivity.class);
		AppstartActivity.this.startActivity(intent);
		AppstartActivity.this.finish();
	}

	/* 如果是第一次启动应用,进入导航界面 */
	private void goGuide() {

		Intent intent = new Intent(AppstartActivity.this, LoginActivity.class);
		AppstartActivity.this.startActivity(intent);
		AppstartActivity.this.finish();
	}

	@Override
	protected void onDestroy() {
		imageView.setImageBitmap(null);
		System.gc();
		super.onDestroy();
	}

}
