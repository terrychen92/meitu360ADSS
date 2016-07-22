package com.carsknowledgetest.mainui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class PicAdapter extends BaseAdapter{

	int[] mPicArray;
	Context mContext;
	public PicAdapter(int[] picArray,Context context) {
		mPicArray = picArray;
		mContext = context;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mPicArray.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mPicArray[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = null;
		if(convertView == null){
			LayoutInflater from = LayoutInflater.from(mContext);
			convertView = from.inflate(R.layout.grid_item, null);
			viewHolder = new ViewHolder();
			viewHolder.imag = (ImageView) convertView.findViewById(R.id.imageView1);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		MyApp.imageLoader.displayImage("drawable://" + mPicArray[position],viewHolder.imag);
		return convertView;
	}

	class ViewHolder{
		ImageView imag;
	}
}
