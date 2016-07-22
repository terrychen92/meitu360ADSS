package com.carsknowledgetest.mainui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.RelativeLayout;

import com.qhad.ads.sdk.adcore.Qhad;
import com.qhad.ads.sdk.interfaces.IQhBannerAd;

/**
 * 
 */
public class TemperamentFragment extends Fragment {
	
	private GridView gridView;
	private int[] picArray = { R.drawable.b, R.drawable.c, R.drawable.d,
			R.drawable.e, R.drawable.g, R.drawable.i,  R.drawable.m, R.drawable.n};
	private RelativeLayout ad2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_temperament, container, false);
		gridView = (GridView) view.findViewById(R.id.gridView1);
		PicAdapter picAdapter = new PicAdapter(picArray, getActivity());
		gridView.setAdapter(picAdapter);

		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getActivity(), SecondActivity.class);
				intent.putExtra("pic", picArray[position]);
				startActivity(intent);
			}
		});
		
		ad2 = (RelativeLayout) view.findViewById(R.id.ad2);
		
		
		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
		IQhBannerAd showBanner = Qhad.showBanner(ad2, getActivity(), "PuPG5iRoks", false);//360���
	}
}
