package com.orangedusk.mytemplate.covid.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orangedusk.mytemplate.R;
import com.orangedusk.mytemplate.common.ui.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ListFragment.newInstance())
                    .commitNow();
        }
    }
}
