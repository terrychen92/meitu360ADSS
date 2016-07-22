package com.carsknowledgetest.mainui;

import com.qhad.ads.sdk.adcore.Qhad;
import com.qhad.ads.sdk.interfaces.IQhBannerAd;
import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class ADActivity extends Activity {

	private RelativeLayout ad5;
	private RelativeLayout ad6;
	private RelativeLayout ad7;
	private RelativeLayout ad8;
	private RelativeLayout ad9;
	private RelativeLayout ad10;
	private RelativeLayout ad11;
	private RelativeLayout ad12;
	private RelativeLayout ad13;
	private RelativeLayout ad14;
	private RelativeLayout ad15;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ad);

		ad5 = (RelativeLayout) findViewById(R.id.ad5);
		ad6 = (RelativeLayout) findViewById(R.id.ad6);
		ad7 = (RelativeLayout) findViewById(R.id.ad7);
		ad8 = (RelativeLayout) findViewById(R.id.ad8);
		ad9 = (RelativeLayout) findViewById(R.id.ad9);
		ad10 = (RelativeLayout) findViewById(R.id.ad10);
		ad11 = (RelativeLayout) findViewById(R.id.ad11);
		ad12 = (RelativeLayout) findViewById(R.id.ad12);
		ad13 = (RelativeLayout) findViewById(R.id.ad13);
		ad14 = (RelativeLayout) findViewById(R.id.ad14);
		ad15 = (RelativeLayout) findViewById(R.id.ad15);
	}

	@Override
	protected void onResume() {
		super.onResume();
		String ad1 =getResources().getString(R.string.app_bannerid);
		String ad2 =getResources().getString(R.string.app_bannerid2);
		String ad3 =getResources().getString(R.string.app_bannerid3);
		String ad4 =getResources().getString(R.string.app_bannerid4);
		
		IQhBannerAd showBanner1 = Qhad.showBanner(ad5, this, ad1, false);//360���
		IQhBannerAd showBanner2 = Qhad.showBanner(ad6, this, ad2, false);//360���
		IQhBannerAd showBanner3 = Qhad.showBanner(ad7, this, ad3, false);//360���
//		IQhBannerAd showBanner4 = Qhad.showBanner(ad8, this, "PPu6PUNpq9", false);//360���
		IQhBannerAd showBanner5 = Qhad.showBanner(ad9, this, ad2, false);//360���
		IQhBannerAd showBanner6 = Qhad.showBanner(ad10, this,ad4, false);//360���
		IQhBannerAd showBanner7 = Qhad.showBanner(ad11, this, ad3, false);//360���
		IQhBannerAd showBanner8 = Qhad.showBanner(ad12, this, ad2, false);//360���
		IQhBannerAd showBanner9 = Qhad.showBanner(ad13, this, ad1, false);//360���
		IQhBannerAd showBanner10 = Qhad.showBanner(ad14, this, ad3, false);//360���
		IQhBannerAd showBanner11 = Qhad.showBanner(ad15, this, ad4, false);//360���
	}
}
