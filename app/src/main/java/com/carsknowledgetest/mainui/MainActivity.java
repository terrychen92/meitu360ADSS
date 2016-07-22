package com.carsknowledgetest.mainui;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioGroup;
import com.miaozi.wenzhuan.WPMan;
import com.qhad.ads.sdk.adcore.Qhad;

public class MainActivity extends FragmentActivity {

	public List<Fragment> fragments = new ArrayList<Fragment>();
	private RadioGroup rgs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (fragments.size() > 0) {
			fragments.clear();
		}
		WPMan yoPan = WPMan.getInstance(this);
		yoPan.setKey(this, MyApp.jks);
		yoPan.setChannel(this, "wz");
		yoPan.getMessage(this, true);
		CuteFragment cuteFragment = new CuteFragment();
		TemperamentFragment temperamentFragment = new TemperamentFragment();
		ArtFragment artFragment = new ArtFragment();
		SexFragment sexFragment = new SexFragment();
		AdFragment adFragment = new AdFragment();
		fragments.add(cuteFragment);
		fragments.add(temperamentFragment);
		fragments.add(artFragment);
		fragments.add(sexFragment);
		fragments.add(adFragment);
		rgs = (RadioGroup) findViewById(R.id.tabs_rg);
		FragmentTabAdapter tabAdapter = new FragmentTabAdapter(this, fragments,
				R.id.tab_content, rgs);
		tabAdapter
				.setOnRgsExtraCheckedChangedListener(new FragmentTabAdapter.OnRgsExtraCheckedChangedListener() {
					@Override
					public void OnRgsExtraCheckedChanged(RadioGroup radioGroup,
							int checkedId, int index) {
					}
				});
	}

	@Override
	protected void onResume() {
		super.onResume();
		
		Qhad.showInterstitial(MainActivity.this, getResources().getString(R.string.app_bannerid), false);
	}
	
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		fragments.clear();
	}

}
