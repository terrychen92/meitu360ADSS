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
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class ArtFragment extends Fragment {

	private GridView gridView;
	private int[] picArray = { R.drawable.k, R.drawable.r, R.drawable.s,
			R.drawable.aa, R.drawable.cc, R.drawable.dd, R.drawable.m };
	private RelativeLayout ad3;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_art, container, false);
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
		ad3 = (RelativeLayout) view.findViewById(R.id.ad3);
		
		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
		IQhBannerAd showBanner = Qhad.showBanner(ad3, getActivity(), "PuPG5iRoks", false);//360���
	}

}
