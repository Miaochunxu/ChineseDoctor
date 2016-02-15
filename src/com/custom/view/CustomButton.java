package com.custom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class CustomButton extends Button {
	public CustomButton(Context context) {
		super(context);
		init(context);
	}

	public CustomButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public CustomButton(Context context, AttributeSet attrs, int defSyle) {
		super(context, attrs, defSyle);
		init(context);
	}

	/***
	 * 设置字体
	 * 
	 * @return
	 */
	public void init(Context context) {
		setTypeface(FontCustom.setFont(context));

	}
}
