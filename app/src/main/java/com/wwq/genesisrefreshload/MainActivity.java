package com.wwq.genesisrefreshload;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wwq.genesisrefreshload.activity.AnimRFRecyclerActivity;
import com.wwq.genesisrefreshload.activity.PullLoadMoreActivity;
import com.wwq.genesisrefreshload.bgarefresh.BGARefreshActivity;
import com.wwq.genesisrefreshload.pulltorefresh.XListViewActivity;
import com.wwq.genesisrefreshload.views.TwinklingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_anim)
    Button btnAnim;
    @BindView(R.id.btn_bgar)
    Button btnBgar;
    @BindView(R.id.btn_loadmore)
    Button btnLoadmore;
    @BindView(R.id.btn_pullto)
    Button btnPullto;
    @BindView(R.id.btn_twinkling)
    Button btnTwinkling;

    public static final int LOADING_DURATION = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_anim, R.id.btn_bgar, R.id.btn_loadmore, R.id.btn_pullto, R.id.btn_twinkling})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_anim:
                startActivity(new Intent(MainActivity.this, AnimRFRecyclerActivity.class));
                break;
            case R.id.btn_bgar:
                startActivity(new Intent(MainActivity.this, BGARefreshActivity.class));
                break;
            case R.id.btn_loadmore:
                startActivity(new Intent(MainActivity.this, PullLoadMoreActivity.class));
                break;
            case R.id.btn_pullto:
                startActivity(new Intent(MainActivity.this, XListViewActivity.class));
                break;
            case R.id.btn_twinkling:
                startActivity(new Intent(MainActivity.this, TwinklingActivity.class));
                break;
        }
    }
}
