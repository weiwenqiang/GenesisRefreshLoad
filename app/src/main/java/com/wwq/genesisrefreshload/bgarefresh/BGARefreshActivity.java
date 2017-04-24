package com.wwq.genesisrefreshload.bgarefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wwq.genesisrefreshload.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wwq on 2017/4/24.
 */

public class BGARefreshActivity extends Activity {
    @BindView(R.id.bga_normal_list)
    Button bgaNormalList;
    @BindView(R.id.bga_normal_Recycler)
    Button bgaNormalRecycler;
    @BindView(R.id.bga_scroll_view)
    Button bgaScrollView;
    @BindView(R.id.bga_sticky_nav)
    Button bgaStickyNav;
    @BindView(R.id.bga_swipe_list)
    Button bgaSwipeList;
    @BindView(R.id.bga_swipe_recycler)
    Button bgaSwipeRecycler;
    @BindView(R.id.bga_view_pager)
    Button bgaViewPager;
    @BindView(R.id.bga_web_view)
    Button bgaWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bga);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bga_normal_list, R.id.bga_normal_Recycler, R.id.bga_scroll_view, R.id.bga_sticky_nav, R.id.bga_swipe_list, R.id.bga_swipe_recycler, R.id.bga_view_pager, R.id.bga_web_view})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bga_normal_list:
                startActivity(new Intent(BGARefreshActivity.this, NormalListViewActivity.class));
                break;
            case R.id.bga_normal_Recycler:
                startActivity(new Intent(BGARefreshActivity.this, NormalRecyclerViewActivity.class));
                break;
            case R.id.bga_scroll_view:
                startActivity(new Intent(BGARefreshActivity.this, ScrollViewActivity.class));
                break;
            case R.id.bga_sticky_nav:
                startActivity(new Intent(BGARefreshActivity.this, StickyNavActivity.class));
                break;
            case R.id.bga_swipe_list:
                startActivity(new Intent(BGARefreshActivity.this, SwipeListViewActivity.class));
                break;
            case R.id.bga_swipe_recycler:
                startActivity(new Intent(BGARefreshActivity.this, SwipeRecyclerViewActivity.class));
                break;
            case R.id.bga_view_pager:
                startActivity(new Intent(BGARefreshActivity.this, ViewPagerActivity.class));
                break;
            case R.id.bga_web_view:
                startActivity(new Intent(BGARefreshActivity.this, WebViewActivity.class));
                break;
        }
    }
}
