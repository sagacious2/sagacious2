package com.sagacious.sdu_online;


import java.util.ArrayList;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.sagacious.sdu_online.tool.BaseTools;
import com.sagacious.sdu_online.view.ColumnHorizontalScrollView;
import com.sagacious.sdu_online.R;
import com.sagacious.sdu_online.app.AppApplication;
import com.sagacious.sdu_online.bean.ChannelItem;
import com.sagacious.sdu_online.bean.ChannelManage;
import com.sagacious.sdu_online.view.DrawerView;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener   {
	private Button info;
	private Button view;
	private Button origin;
	private Button others;
	
	private infoFragment minfo;
	private viewFragment mview;
	private originFragment morigin;
	private othersFragment mothers;
	

	private ColumnHorizontalScrollView mColumnHorizontalScrollView;
	LinearLayout mRadioGroup_content;
	LinearLayout ll_more_columns;
	RelativeLayout rl_column;
	private ViewPager mViewPager;
	private ImageView button_more_columns;
//	/** 用户选择的新闻分类列表*/
//	private ArrayList<ChannelItem> userChannelList=new ArrayList<ChannelItem>();
//	/** 当前选中的栏目*/
	private int columnSelectIndex = 0;
//	/** 左阴影部分*/
	public ImageView shade_left;
//	/** 右阴影部分 */
	public ImageView shade_right;
//	/** 屏幕宽度 */
	private int mScreenWidth = 0;
//	/** Item宽度 */
	private int mItemWidth = 0;
	private ArrayList<Fragment> fragments = new ArrayList<Fragment>();
//	
	protected SlidingMenu side_drawer;
//	
//	/** 请求CODE */
	public final static int CHANNELREQUEST = 1;
//	/** 调整返回的RESULTCODE */
	public final static int CHANNELRESULT = 10;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);		
		setContentView(R.layout.fragment_main);
		
		info = (Button)findViewById(R.id.button1);
		view = (Button)findViewById(R.id.button2);
		origin = (Button)findViewById(R.id.button3);
		others =(Button)findViewById(R.id.button4);

		
		info.setOnClickListener(this);
		view.setOnClickListener(this);
		origin.setOnClickListener(this);
		others.setOnClickListener(this);
		
		
//		mScreenWidth = BaseTools.getWindowsWidth(this);
//		mItemWidth = mScreenWidth / 7;// 一个Item宽度为屏幕的1/7
		
		//setDefaultFragment();
		//initView();
//		initSlidingMenu();
//		setDefaultFragment();
//		if (savedInstanceState == null) {
//			getFragmentManager().beginTransaction()
//					.add(R.id.item, new PlaceholderFragment()).commit();
//		}
	}
//	private void setDefaultFragment()
//	{
//		FragmentManager fm = getFragmentManager();
//		FragmentTransaction transaction = fm.beginTransaction();
//		minfo = new infoFragment();
//		transaction.replace(R.id.item, mview);
//		transaction.commit();
//	}
	
//	private void initView()
//	{
//		mColumnHorizontalScrollView =  (ColumnHorizontalScrollView)findViewById(R.id.mColumnHorizontalScrollView);
//		mRadioGroup_content = (LinearLayout)findViewById(R.id.mRadioGroup_content);
//		ll_more_columns = (LinearLayout) findViewById(R.id.ll_more_columns);
//		rl_column = (RelativeLayout) findViewById(R.id.rl_column);
//		button_more_columns = (ImageView) findViewById(R.id.button_more_columns);
		//shade_left = (ImageView) findViewById(R.id.shade_left);
		//shade_right = (ImageView) findViewById(R.id.shade_right);
		//button_more_columns.setOnClickListener(this);
//		button_more_columns.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Intent intent_channel = new  Intent(getApplicationContext(), ChannelActivity.class);
//				startActivityForResult(intent_channel, CHANNELREQUEST);
//				overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//			}
//		});
//	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		FragmentManager fm = getFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		switch(v.getId())
		{
		case R.id.button1:
			if(minfo == null)
				minfo = new infoFragment();
			transaction.replace(R.id.item,minfo);
			transaction.commit();
			break;
		case R.id.button2:
			if(mview == null)
				mview = new viewFragment();
			transaction.replace(R.id.item,mview);
			transaction.commit();
			break;	
		case R.id.button3:
			if(morigin == null)
				morigin = new originFragment();
			transaction.replace(R.id.item,morigin);
			transaction.commit();
			break;
		case R.id.button4:
			if(mothers == null)
				mothers = new othersFragment();
			transaction.replace(R.id.item,mothers);
			transaction.commit();
			break;
		case R.id.button_more_columns:
			Intent intent_channel = new  Intent(getApplicationContext(), ChannelActivity.class);
			startActivityForResult(intent_channel, CHANNELREQUEST);
			overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
			break;
			
		}
		//transaction.commit();
	}
	
	/** 获取Column栏目 数据*/
//	private void initColumnData() {
//		userChannelList = ((ArrayList<ChannelItem>)ChannelManage.getManage(AppApplication.getApp().getSQLHelper()).getUserChannel());
//	}
//
//	/** 
//	 *  初始化Column栏目项
//	 * */
//	private void initTabColumn() {
//		mRadioGroup_content.removeAllViews();
//		int count =  userChannelList.size();
//		mColumnHorizontalScrollView.setParam(this, mScreenWidth, mRadioGroup_content, shade_left, shade_right, ll_more_columns, rl_column);
//		for(int i = 0; i< count; i++){
//			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(mItemWidth , LayoutParams.WRAP_CONTENT);
//			params.leftMargin = 5;
//			params.rightMargin = 5;
////			TextView localTextView = (TextView) mInflater.inflate(R.layout.column_radio_item, null);
//			TextView columnTextView = new TextView(this);
//			columnTextView.setTextAppearance(this, R.style.top_category_scroll_view_item_text);
////			localTextView.setBackground(getResources().getDrawable(R.drawable.top_category_scroll_text_view_bg));
//			columnTextView.setBackgroundResource(R.drawable.radio_buttong_bg);
//			columnTextView.setGravity(Gravity.CENTER);
//			columnTextView.setPadding(5, 5, 5, 5);
//			columnTextView.setId(i);
//			columnTextView.setText(userChannelList.get(i).getName());
//			columnTextView.setTextColor(getResources().getColorStateList(R.color.top_category_scroll_text_color_day));
//			if(columnSelectIndex == i){
//				columnTextView.setSelected(true);
//			}
//			columnTextView.setOnClickListener(new OnClickListener() {
//				
//				@Override
//				public void onClick(View v) {
//			          for(int i = 0;i < mRadioGroup_content.getChildCount();i++){
//				          View localView = mRadioGroup_content.getChildAt(i);
//				          if (localView != v)
//				        	  localView.setSelected(false);
//				          else{
//				        	  localView.setSelected(true);
//				        	  mViewPager.setCurrentItem(i);
//				          }
//			          }
//			          Toast.makeText(getApplicationContext(), userChannelList.get(v.getId()).getName(), Toast.LENGTH_SHORT).show();
//				}
//			});
//			mRadioGroup_content.addView(columnTextView, i ,params);
//		}
//	}
//	/** 
//	 *  选择的Column里面的Tab
//	 * */
//	private void selectTab(int tab_postion) {
//		columnSelectIndex = tab_postion;
//		for (int i = 0; i < mRadioGroup_content.getChildCount(); i++) {
//			View checkView = mRadioGroup_content.getChildAt(tab_postion);
//			int k = checkView.getMeasuredWidth();
//			int l = checkView.getLeft();
//			int i2 = l + k / 2 - mScreenWidth / 2;
//			// rg_nav_content.getParent()).smoothScrollTo(i2, 0);
//			mColumnHorizontalScrollView.smoothScrollTo(i2, 0);
//			// mColumnHorizontalScrollView.smoothScrollTo((position - 2) *
//			// mItemWidth , 0);
//		}
//		//判断是否选中
//		for (int j = 0; j <  mRadioGroup_content.getChildCount(); j++) {
//			View checkView = mRadioGroup_content.getChildAt(j);
//			boolean ischeck;
//			if (j == tab_postion) {
//				ischeck = true;
//			} else {
//				ischeck = false;
//			}
//			checkView.setSelected(ischeck);
//		}
//	}
	/** 
	 *  ViewPager切换监听方法
	 * */
//	public OnPageChangeListener pageListener= new OnPageChangeListener(){
//
//		@Override
//		public void onPageScrollStateChanged(int arg0) {
//		}
//
//		@Override
//		public void onPageScrolled(int arg0, float arg1, int arg2) {
//		}
//
//		@Override
//		public void onPageSelected(int position) {
//			// TODO Auto-generated method stub
//			mViewPager.setCurrentItem(position);
//			selectTab(position);
//		}
//	};
	
//	protected void initSlidingMenu() {
//		side_drawer = new DrawerView(this).initSlidingMenu();
//	}
	
//	private long mExitTime;
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		// TODO Auto-generated method stub
//		if (keyCode == KeyEvent.KEYCODE_BACK) {
//			if(side_drawer.isMenuShowing() ||side_drawer.isSecondaryMenuShowing()){
//				side_drawer.showContent();
//			}else {
//				if ((System.currentTimeMillis() - mExitTime) > 2000) {
//					Toast.makeText(this, "在按一次退出",
//							Toast.LENGTH_SHORT).show();
//					mExitTime = System.currentTimeMillis();
//				} else {
//					finish();
//				}
//			}
//			return true;
//		}
//		//拦截MENU按钮点击事件，让他无任何操作
//		if (keyCode == KeyEvent.KEYCODE_MENU) {
//			return true;
//		}
//		return super.onKeyDown(keyCode, event);
//	}
	
//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		// TODO Auto-generated method stub
//		switch (requestCode) {
//		case CHANNELREQUEST:
//			if(resultCode == CHANNELRESULT){
//				setChangelView();
//			}
//			break;
//
//		default:
//			break;
//		}
//		super.onActivityResult(requestCode, resultCode, data);
//	}

	
}
