package com.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction ft;
    Fragment currentFragment = null;

    private static final String TAG = "MainActivity";

    //private SectionStatePagerAdapter mSectionStatePagerAdapter;
    //private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    Fragment1 fragment = new Fragment1();
                    switchToFragment(fragment);
                    break;

                case R.id.navigation_dashboard:
                    //mTextMessage.setText(R.string.title_dashboard);
                    Fragment2 fragment2 = new Fragment2();
                    switchToFragment(fragment2);
                    break;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    Fragment3 fragment3 = new Fragment3();
                    switchToFragment(fragment3);
                    break;
                    /**
                case R.id.navigation_more:
                    //mTextMessage.setText(R.string.title_more);
                    switchToFragmeayout.fragment_onent3();
                    break;
                     **/
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ft = getSupportFragmentManager().beginTransaction();
        currentFragment = new Fragment1();
        ft.replace(R.id.frame_layout, currentFragment);
        ft.commit();

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void switchToFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(currentFragment.getId(), fragment).commit();
        currentFragment = fragment;
    }
}
