package com.carsknowledgetest.mainui;

import com.qhad.ads.sdk.adcore.Qhad;
import com.qhad.ads.sdk.interfaces.IQhBannerAd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class AdFragment extends Fragment {

	private RelativeLayout ad5;
	private RelativeLayout ad6;
	private RelativeLayout ad7;
	private RelativeLayout ad9;
	private RelativeLayout ad10;
	private RelativeLayout ad11;
	private RelativeLayout ad12;
	private RelativeLayout ad13;
	private RelativeLayout ad14;
	private RelativeLayout ad15;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_ad, container, false);
		ad5 = (RelativeLayout) view.findViewById(R.id.ad5);
		ad6 = (RelativeLayout) view.findViewById(R.id.ad6);
		ad7 = (RelativeLayout) view.findViewById(R.id.ad7);
		ad9 = (RelativeLayout) view.findViewById(R.id.ad9);
		ad10 = (RelativeLayout) view.findViewById(R.id.ad10);
		ad11 = (RelativeLayout) view.findViewById(R.id.ad11);
		ad12 = (RelativeLayout) view.findViewById(R.id.ad12);
		ad13 = (RelativeLayout) view.findViewById(R.id.ad13);
		ad14 = (RelativeLayout) view.findViewById(R.id.ad14);
		ad15 = (RelativeLayout) view.findViewById(R.id.ad15);
		view.findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getActivity(), ADActivity.class));
			}
		});

		return view;
	}

	
	@Override
	public void onResume() {
		super.onResume();
		String ad1 =getResources().getString(R.string.app_bannerid);
		String ad2 =getResources().getString(R.string.app_bannerid2);
		String ad3 =getResources().getString(R.string.app_bannerid3);
		String ad4 =getResources().getString(R.string.app_bannerid4);
		IQhBannerAd showBanner1 = Qhad.showBanner(ad5, getActivity(), ad1, false);//360���
		IQhBannerAd showBanner2 = Qhad.showBanner(ad6, getActivity(), ad2, false);//360���
		IQhBannerAd showBanner3 = Qhad.showBanner(ad7, getActivity(), ad3, false);//360���
		IQhBannerAd showBanner5 = Qhad.showBanner(ad9, getActivity(), ad2, false);//360���
		IQhBannerAd showBanner6 = Qhad.showBanner(ad10, getActivity(),ad4, false);//360���
		IQhBannerAd showBanner7 = Qhad.showBanner(ad11, getActivity(), ad3, false);//360���
		IQhBannerAd showBanner8 = Qhad.showBanner(ad12, getActivity(), ad2, false);//360���
		IQhBannerAd showBanner9 = Qhad.showBanner(ad13, getActivity(), ad1, false);//360���
		IQhBannerAd showBanner10 = Qhad.showBanner(ad14, getActivity(), ad3, false);//360���
		IQhBannerAd showBanner11 = Qhad.showBanner(ad15, getActivity(), ad4, false);//360���
	}
}
