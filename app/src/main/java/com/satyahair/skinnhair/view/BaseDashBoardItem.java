package com.satyahair.skinnhair.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * Created by n.goyal on 12/1/2016.
 */
public abstract class BaseDashBoardItem {


    Context mContext;

    public BaseDashBoardItem(){

    }

    public BaseDashBoardItem(Context context){
        mContext = context;
    }


    public abstract Drawable getDrawable();


    public abstract String getText();

    public abstract Void onClick(View v);
}
