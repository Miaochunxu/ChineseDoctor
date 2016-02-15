package com.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;

import com.chinadoctor.MainActivity;
import com.chinadoctor.R;
import com.custom.view.CustomButton;

public class LoginActivity extends Activity {

	private CheckBox cb_teacher, cb_student;

	private CustomButton btn_login;

	private EditText et_username, et_pasw;

	private boolean ifCheck = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);
		initView();

		initEvent();
	}

	private void initEvent() {

		cb_teacher.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				initCheck();
				if (isChecked) {
					cb_teacher.setChecked(true);
					ifCheck = true;
				} else {
					ifCheck = false;
				}
			}

		});

		cb_student.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				initCheck();
				if (isChecked) {
					cb_student.setChecked(true);
					ifCheck = true;
				} else {
					ifCheck = false;
				}
			}

		});

		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String username = et_username.getText().toString().trim() + "";
				String password = et_pasw.getText().toString().trim() + "";

				if (username.equals("") || username.equals(null)) {
					Toast.makeText(LoginActivity.this, "账号不能为空",
							Toast.LENGTH_SHORT).show();
				} else if (password.equals("") || password.equals(null)) {
					Toast.makeText(LoginActivity.this, "密码不能为空",
							Toast.LENGTH_SHORT).show();
				} else if (!ifCheck) {
					Toast.makeText(LoginActivity.this, "选择登录方式",
							Toast.LENGTH_SHORT).show();
				} else {
					Intent intent = new Intent(LoginActivity.this,
							MainActivity.class);
					startActivity(intent);
					LoginActivity.this.finish();
				}
			}
		});
	}

	private void initCheck() {
		cb_teacher.setChecked(false);
		cb_student.setChecked(false);
	}

	private void initView() {

		// ########

		// getActionBar().setBackgroundDrawable(
		// this.getBaseContext().getResources()
		// .getDrawable(R.drawable.actionbar_bg));
		// getActionBar().setTitle("登陆界面");
		// int titleId = Resources.getSystem().getIdentifier("action_bar_title",
		// "id", "android");
		// TextView title = (TextView) findViewById(titleId);
		// title.setTextColor(getResources().getColor(
		// R.color.abs__background_holo_dark));
		// title.setTextSize(20);

		// ########

		cb_teacher = (CheckBox) findViewById(R.id.cb_teacher);
		cb_student = (CheckBox) findViewById(R.id.cb_student);
		btn_login = (CustomButton) findViewById(R.id.btn_login);
		et_username = (EditText) findViewById(R.id.et_username);
		et_pasw = (EditText) findViewById(R.id.et_password);
	}

}
