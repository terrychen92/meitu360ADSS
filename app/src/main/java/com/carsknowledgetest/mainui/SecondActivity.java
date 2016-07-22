package com.carsknowledgetest.mainui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.qhad.ads.sdk.adcore.Qhad;
import com.qhad.ads.sdk.interfaces.IQhBannerAd;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		int extra = getIntent().getIntExtra("pic", -1);
		MyApp.imageLoader.displayImage("drawable://" + extra,imageView1);
		
		RelativeLayout ad = (RelativeLayout) findViewById(R.id.ad_layout);

		IQhBannerAd showBanner11 = Qhad.showBanner(ad, this, "a5FQuMM64W", false);//360���
        
	}

}
