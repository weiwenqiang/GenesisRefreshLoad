package com.wwq.genesisrefreshload.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.wwq.genesisrefreshload.R;
import com.wwq.genesisrefreshload.loadmore.FirstFragment;

import butterknife.ButterKnife;

/**
 * Created by wwq on 2017/4/22.
 */

public class PullLoadMoreActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_more);
        ButterKnife.bind(this);

        getSupportFragmentManager().beginTransaction().replace(
                R.id.fragment_container, new FirstFragment()).commit();
    }
}
