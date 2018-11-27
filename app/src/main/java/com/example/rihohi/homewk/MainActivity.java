package com.example.rihohi.homewk;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static boolean flag;
    private BottomNavigationView bottomNavigationView;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;

    private FragmentTransaction transaction;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    replaceFragment(fragment1);
                    return true;
                case R.id.navigation_dashboard:
                    if (!flag){
                        Toast.makeText(MainActivity.this,
                                "password is false",Toast.LENGTH_SHORT).show();
                        return  false;
                    }else
                       replaceFragment(fragment2);
                    return true;
                case R.id.navigation_notifications:
                    if (!flag){
                        Toast.makeText(MainActivity.this,
                                "password is false",Toast.LENGTH_SHORT).show();
                        return false;
                    }else
                       replaceFragment(fragment3);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        replaceFragment(fragment1);
    }

    private void replaceFragment(Fragment fragment){
        transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.search_edit_frame,fragment);
        transaction.commit();
    }
    private void init(){
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragment3=new Fragment3();
        flag=false;
    }

}
