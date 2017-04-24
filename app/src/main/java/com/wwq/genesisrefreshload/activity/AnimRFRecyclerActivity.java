package com.wwq.genesisrefreshload.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.wwq.genesisrefreshload.R;
import com.wwq.genesisrefreshload.fragment.LinearFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wwq on 2017/4/22.
 */

public class AnimRFRecyclerActivity extends Activity {

    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_rf);
        ButterKnife.bind(this);

        getFragmentManager().beginTransaction().replace(
                R.id.fragment_container, new LinearFragment()).commit();
    }
}
