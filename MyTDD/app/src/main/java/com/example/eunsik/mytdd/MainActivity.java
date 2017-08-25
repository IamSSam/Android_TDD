package com.example.eunsik.mytdd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

public class MainActivity extends SingleFragmentActivity {

    protected Fragment createFragment() {
        return new MainFragment();
    }

}
