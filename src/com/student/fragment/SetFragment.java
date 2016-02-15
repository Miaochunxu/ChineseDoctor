package com.student.fragment;

import com.chinadoctor.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SetFragment extends Fragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_student_set, container,
				false);

		initView();

		initEvent();

		return view;
	}

	private void initEvent() {

	}

	private void initView() {

	}

}
