package com.student.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.adapter.McxBaseAdapter;
import com.chinadoctor.R;
import com.custom.view.CustomTextView;
import com.list.AllListCell;
import com.model.StringAndState;

public class HomeFragment extends Fragment {

	private View view;

	private ListView listViewOne, listViewTwo;

	private McxBaseAdapter<StringAndState> adapterOne;

	private McxBaseAdapter<String> adapterTwo;

	private AllListCell allListCell = new AllListCell();

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_student_home, container,
				false);

		initView();

		initEvent();

		return view;
	}

	private void initEvent() {

		adapterOne.initCheckDate();
System.out.println("aaaaaaaaaaaaaaa="+allListCell.getListOne().size());
		listViewOne.setOnItemClickListener(new OnItemClickListener() {

			@SuppressWarnings("static-access")
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

//				for (int i = 0; i < 30; i++) {
//					adapterOne.getIsSelected().set(i, false);
//				}
				
//				adapterOne.getIsSelected().set(position,true);
				
				adapterOne.notifyDataSetChanged();
				adapterTwo.addUpdata(allListCell.getListTwo(position));
				adapterTwo.notifyDataSetChanged();

			}
		});
	}

	private void initView() {
		listViewOne = (ListView) view.findViewById(R.id.listview_left);

		adapterOne = new McxBaseAdapter<StringAndState>(getActivity(),
				R.layout.adapter_one) {

			@Override
			protected void initListCell(int position, View listCell,
					ViewGroup parent) {
				StringAndState data = getItem(position);
				CustomTextView textView = (CustomTextView) listCell
						.findViewById(R.id.tv_adapterOne);
				textView.setText(data.getName());
				
				if (data.getState() == 0) {
					textView.setTextSize(20);
					textView.setTextColor(getResources().getColor(
							R.color.text_zhujiemian_left_big));
				} else {
					textView.setTextSize(18);
					textView.setTextColor(getResources().getColor(
							R.color.text_zhujiemian_left));
//					if (getIsSelected().get(position)) {
//						textView.setBackgroundColor(0xffffffff);
//					}else {
//						textView.setBackgroundColor(0x00000000);
//					}
				}
			}
		};

		listViewOne.setAdapter(adapterOne);
		adapterOne.addUpdata(allListCell.getListOne());
		adapterOne.initCheckDate();
		
		adapterOne.notifyDataSetChanged();
		
		listViewTwo = (ListView) view.findViewById(R.id.listview_right);
		adapterTwo = new McxBaseAdapter<String>(getActivity(),
				R.layout.adapter_one) {

			@Override
			protected void initListCell(int position, View listCell,
					ViewGroup parent) {
				CustomTextView textView = (CustomTextView) listCell
						.findViewById(R.id.tv_adapterOne);
				textView.setText(getItem(position).toString());
			}
		};

		listViewTwo.setAdapter(adapterTwo);
	}

}
