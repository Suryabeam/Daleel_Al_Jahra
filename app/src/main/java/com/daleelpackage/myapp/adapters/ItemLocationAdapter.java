package com.daleelpackage.myapp.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.daleelpackage.myapp.R;
import com.daleelpackage.myapp.helper.ItemLocationOnclicklistener;
import com.daleelpackage.myapp.home.helper.ChooseLocationModel;
import com.daleelpackage.myapp.utills.SettingsMain;

public class ItemLocationAdapter extends RecyclerView.Adapter<ItemLocationAdapter.CustomViewHolder> {
    private List<ChooseLocationModel> chooseLocationModelList;
    private Context mContext;
    private ItemLocationOnclicklistener itemLocationOnclicklistener;
    SettingsMain settingsMain;
    private Spinner spinner;

    public ItemLocationAdapter(Context context, List<ChooseLocationModel> chooseLocationModelList) {
        this.chooseLocationModelList = chooseLocationModelList;
        this.mContext = context;
        settingsMain = new SettingsMain(context);
    }


    @Override
    public ItemLocationAdapter.CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_layout_multi, null);
        return new ItemLocationAdapter.CustomViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull ItemLocationAdapter.CustomViewHolder customViewHolder, int i) {
        ChooseLocationModel chooseLocationModel = chooseLocationModelList.get(i);
        customViewHolder.title.setText(chooseLocationModelList.get(i).getTitle());
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemLocationOnclicklistener.onItemClick(chooseLocationModel);
            }
        };
        customViewHolder.cardViewLanguage.setOnClickListener(listener);
        if (i%2==0){
            customViewHolder.cardViewLanguage.setBackgroundColor(Color.parseColor("#f1f1f1"));
            //"#e1e1e1"
        }
            else{
            customViewHolder.cardViewLanguage.setBackgroundColor(Color.WHITE);
        }
    }



    @Override
    public int getItemCount() {
        return chooseLocationModelList.size();
    }


    public ItemLocationOnclicklistener getOnItemClickListener() {
        return itemLocationOnclicklistener;
    }

    public void setItemLocationOnclicklistener(ItemLocationOnclicklistener itemLocationOnclicklistener) {
        this.itemLocationOnclicklistener = itemLocationOnclicklistener;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title, title2, locationId;
        View view;
        RelativeLayout cardView;
        CardView cardViewLanguage;

        CustomViewHolder(View view) {
            super(view);
//this.title2=view.findViewById(R.id.txt_translated_name);
//            this.imageView = view.findViewById(R.id.img_job_logo);
            this.title = view.findViewById(R.id.txt_jobs_include);
            title.setTextColor(Color.parseColor("#797979"));
            this.view = view.findViewById(R.id.separator);
            view.setBackgroundColor(Color.parseColor("#f1f1f1"));
            this.locationId = view.findViewById(R.id.Select_Country);
            this.cardView = view.findViewById(R.id.card_language);
            this.cardViewLanguage=view.findViewById(R.id.cardView);
        }
    }
}
