package com.daleelpackage.myapp.helper;

import android.view.View;

import com.daleelpackage.myapp.modelsList.myAdsModel;

public interface MyAdsOnclicklinstener {

    void onItemClick(myAdsModel item);

    void delViewOnClick(View v, int position);

    void editViewOnClick(View v, int position);

}
