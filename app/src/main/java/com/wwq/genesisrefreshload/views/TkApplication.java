package com.wwq.genesisrefreshload.views;

import android.app.Application;
import android.os.StrictMode;

import com.squareup.leakcanary.LeakCanary;
import com.wwq.genesisrefreshload.App;
import com.wwq.genesisrefreshload.bgarefresh.engine.Engine;

import butterknife.ButterKnife;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.GINGERBREAD;

/**
 * Created by lcodecore on 2016/12/4.
 */

public class TkApplication extends App {

    @Override
    public void onCreate() {
        super.onCreate();

        ButterKnife.setDebug(true);

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        enabledStrictMode();
        LeakCanary.install(this);

    }

    private void enabledStrictMode() {
        if (SDK_INT >= GINGERBREAD) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder() //
                    .detectAll() //
                    .penaltyLog() //
                    .penaltyDeath() //
                    .build());
        }
    }
}
