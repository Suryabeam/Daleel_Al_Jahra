package com.daleelpackage.myapp.helper;

import android.view.View;

import com.daleelpackage.myapp.modelsList.catSubCatlistModel;

public interface CatSubCatOnclicklinstener {
    void onItemClick(catSubCatlistModel item);

    void onItemTouch(catSubCatlistModel item);

    void addToFavClick(View v, String position);

}
