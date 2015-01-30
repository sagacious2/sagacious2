package com.sagacious.sdu_online;


import java.util.ArrayList;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.sagacious.sdu_online.bean.ChannelItem;
import com.sagacious.sdu_online.view.ColumnHorizontalScrollView;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class infoFragment extends Fragment {
	
//	private ColumnHorizontalScrollView mColumnHorizontalScrollView;
//	LinearLayout mRadioGroup_content;
//	LinearLayout ll_more_columns;
//	RelativeLayout rl_column;
//	private ViewPager mViewPager;
//	private ImageView button_more_columns;
//	/** 用户选择的新闻分类列表*/
//	//private ArrayList<ChannelItem> userChannelList=new ArrayList<ChannelItem>();
//	/** 当前选中的栏目*/
//	private int columnSelectIndex = 0;
//	/** 左阴影部分*/
//	public ImageView shade_left;
//	/** 右阴影部分 */
//	public ImageView shade_right;
//	/** 屏幕宽度 */
//	private int mScreenWidth = 0;
//	/** Item宽度 */
//	private int mItemWidth = 0;
//	private ArrayList<Fragment> fragments = new ArrayList<Fragment>();
//	
//	protected SlidingMenu side_drawer;
//	
//	/** 请求CODE */
//	public final static int CHANNELREQUEST = 1;
//	/** 调整返回的RESULTCODE */
//	public final static int CHANNELRESULT = 10;
	
	public   View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.infofragment, container,false);
//		mScreenWidth = BaseTools.getWindowsWidth(MainActivity);
		
		
		//initSlidingMenu();
		
	}
//	@Override
//	public void onActivityCreated(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onActivityCreated(savedInstanceState);
////		initView();
////		mItemWidth = values.mItemWidth;// 一个Item宽度为屏幕的1/7
//	}
//	private void initView()
//	{
//		mColumnHorizontalScrollView =  (ColumnHorizontalScrollView)getActivity().findViewById(R.id.mColumnHorizontalScrollView);
//		mRadioGroup_content = (LinearLayout)getActivity().findViewById(R.id.mRadioGroup_content);
//		ll_more_columns = (LinearLayout) getActivity().findViewById(R.id.ll_more_columns);
//		rl_column = (RelativeLayout) getActivity().findViewById(R.id.rl_column);
//		button_more_columns = (ImageView) getActivity().findViewById(R.id.button_more_columns);
//		shade_left = (ImageView) getActivity().findViewById(R.id.shade_left);
//		shade_right = (ImageView) getActivity().findViewById(R.id.shade_right);
////		button_more_columns.setOnClickListener(new OnClickListener() {
////			
////			@Override
////			public void onClick(View v) {
////				// TODO Auto-generated method stub
////				Intent intent_channel = new  Intent(getApplicationContext(), ChannelActivity.class);
////				startActivityForResult(intent_channel, CHANNELREQUEST);
////				overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
////			}
////		});
//	}

	
	

}
