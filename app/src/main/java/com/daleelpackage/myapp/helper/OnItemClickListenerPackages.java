package com.daleelpackage.myapp.helper;

import com.daleelpackage.myapp.modelsList.PackagesModel;

public interface OnItemClickListenerPackages {
    void onItemClick(PackagesModel item);

    void onItemTouch();

    void onItemSelected(PackagesModel packagesModel, int spinnerPosition);
}
