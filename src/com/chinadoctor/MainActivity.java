package com.chinadoctor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.student.fragment.CommentFragment;
import com.student.fragment.HomeFragment;
import com.student.fragment.SetFragment;

public class MainActivity extends FragmentActivity implements OnClickListener {

	private Fragment fg_home, fg_comment, fg_set;

	private ImageView img_home, img_comment, img_set, img_menu_top;

	private TextView tv_top;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();

		initEvent();

		FragmentTransaction t = getSupportFragmentManager().beginTransaction();
		if (fg_home == null) {
			fg_home = new HomeFragment();
			t.add(R.id.fg_main_content, fg_home);
		} else {
			t.show(fg_home);
		}
		t.commit();

	}

	private void initEvent() {
		img_home.setOnClickListener(this);
		img_comment.setOnClickListener(this);
		img_set.setOnClickListener(this);
	}

	private void initView() {

		img_home = (ImageView) findViewById(R.id.img_main_student_home);
		img_comment = (ImageView) findViewById(R.id.img_main_student_comment);
		img_set = (ImageView) findViewById(R.id.img_main_student_set);
		img_menu_top = (ImageView) findViewById(R.id.img_top_menu);

		tv_top = (TextView) findViewById(R.id.tv_main_topname);
	}

	@Override
	public void onClick(View v) {

		outImageView();
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		HideFragment(transaction, fg_home, fg_comment, fg_set);

		switch (v.getId()) {
		case R.id.img_main_student_home:
			transaction.show(fg_home);
			img_home.setImageResource(R.drawable.bg_bottom_one);
			tv_top.setText("中医学习助手");
			break;
		case R.id.img_main_student_comment:
			if (fg_comment == null) {
				fg_comment = new CommentFragment();
				transaction.add(R.id.fg_main_content, fg_comment);
			} else {
				transaction.show(fg_comment);
			}
			img_comment.setImageResource(R.drawable.bg_bottom_two);
			tv_top.setText("交流区");
			break;
		case R.id.img_main_student_set:
			if (fg_set == null) {
				fg_set = new SetFragment();
				transaction.add(R.id.fg_main_content, fg_set);
			} else {
				transaction.show(fg_set);
			}
			img_set.setImageResource(R.drawable.bg_bottom_three);
			tv_top.setText("设置");
			break;
		default:
			break;
		}
		transaction.commit();
	}

	public void HideFragment(FragmentTransaction transaction, Fragment f01,
			Fragment f02, Fragment f03) {

		if (f01 != null) {
			transaction.hide(f01);
		}
		if (f02 != null) {
			transaction.hide(f02);
		}
		if (f03 != null) {
			transaction.hide(f03);
		}
	}

	private void outImageView() {
		img_home.setImageResource(R.drawable.bg_bottom_one_whlite);
		img_comment.setImageResource(R.drawable.bg_bottom_two_whlite);
		img_set.setImageResource(R.drawable.bg_bottom_three_whlite);
	}
}
