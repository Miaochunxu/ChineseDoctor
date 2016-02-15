package com.student.fragment;

import com.adapter.McxBaseAdapter;
import com.chinadoctor.R;
import com.custom.view.CustomTextView;
import com.model.ListComment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CommentFragment extends Fragment {

	private View view;

	private ListView listView;

	private McxBaseAdapter<ListComment> adapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_student_comment, container,
				false);

		initView();

		initEvent();

		return view;
	}

	private void initEvent() {

	}

	private void initView() {

		listView = (ListView) view.findViewById(R.id.lv_student_comment);

		adapter = new McxBaseAdapter<ListComment>(getActivity(),
				R.layout.layout_list_cell_comment) {

			@Override
			protected void initListCell(int position, View listCell,
					ViewGroup parent) {
				ListComment data = getItem(position);
				ImageView img = (ImageView) listCell
						.findViewById(R.id.img_comment_list);
				CustomTextView tv = (CustomTextView) listCell
						.findViewById(R.id.tv_comment_list);

				tv.setText(data.getCommet());
				img.setImageResource(data.getImgSrc());
			}
		};
		listView.setAdapter(adapter);
	}

}
