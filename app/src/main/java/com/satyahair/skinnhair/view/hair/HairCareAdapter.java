package com.satyahair.skinnhair.view.hair;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.satyahair.skinnhair.R;


/**
 * Created by s.gagandeep on 11/18/2016.
 */
public class HairCareAdapter extends RecyclerView.Adapter<HairCareAdapter.ViewHolder> {


    Context mContext;
    String [] options;
    private final int[] OptionsImages = new int[] {
            R.drawable.treatments,
            R.drawable.testimonials,
            R.drawable.case_study,
            R.drawable.query,
            R.drawable.upload,
            R.drawable.gallery,
            R.drawable.faq
    };

    public HairCareAdapter(Context context) {

       mContext = context;
        Resources res = mContext.getResources();
        options = res.getStringArray(R.array.options);

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hair_care_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.setContent(position);
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView optionImage;
        TextView optionText;

        public ViewHolder(View itemView) {
            super(itemView);
            optionImage = (ImageView)itemView.findViewById(R.id.optionimage);
            optionText = (TextView)itemView.findViewById(R.id.optiontext);
        }
        public void setContent(int position) {
            optionImage.setImageResource(OptionsImages[position]);
            optionText.setText(options[position]);
        }


    }

}
