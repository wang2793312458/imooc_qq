package com.imooc.slidingmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.imooc.slidingmenu.view.SlidingMenu;

public class MainActivity extends AppCompatActivity {


    private SlidingMenu mLeftMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mLeftMenu = (SlidingMenu) findViewById(R.id.id_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
