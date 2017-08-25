package com.renxin.cheku.materialtestdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created on 2017/8/25.
 * Function:
 *
 * @author Zhipeng.Fan
 */

public class GirlActivity extends AppCompatActivity {

    private AppBarLayout mAppBarLayout;
    private CollapsingToolbarLayout mToolbarLayout;
    private ImageView mImageView;
    private Toolbar mToolbar;
    private TextView mContent;
    private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_girl);
        findView();
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        mToolbarLayout.setTitle("美女");
        Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1503637822752&di=b6d41e029efe86796a21a64bb3f36bfd&imgtype=0&src=http%3A%2F%2Fimg2.niutuku.com%2Fdesk%2F1207%2F1100%2Fbizhi-1100-7201.jpg").into(mImageView);
        mContent.setText("美女");
        for (int i = 0; i < 500; i++) {
            mContent.append("美女");
        }


    }

    private void findView() {
        mAppBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        mToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        mImageView = (ImageView) findViewById(R.id.iamge);
        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        mContent = (TextView) findViewById(R.id.content);
        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.floating_button);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
