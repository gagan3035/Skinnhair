package com.satyahair.skinnhair.view;




import android.content.Context;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.satyahair.skinnhair.R;


/**
 * Created by s.gagandeep on 11/18/2016.
 */
public class PromotionalPagerAdapter extends PagerAdapter {

    private Context mContext;
    private final int[] PromotionalImages = new int[] {
            R.drawable.hairfall1,
            R.drawable.hairfall2,
            R.drawable.hairfall3
    };

    public PromotionalPagerAdapter(Context context){

        mContext = context;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater =LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.promotional_layout, container, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.promtional_image);
        imageView.setImageResource(PromotionalImages[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}
