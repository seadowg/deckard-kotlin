package com.github.jmfayard.okandroid;

import android.content.Context;
import android.view.LayoutInflater;
import com.github.jmfayard.okandroid.databinding.DetailBinding;
import com.wealthfront.magellan.BaseScreenView;

public class DetailView extends BaseScreenView<DetailScreen> {

  DetailView(Context context) {
    super(context);
    LayoutInflater.from(context).inflate(R.layout.detail, this, true);
    //DetailBinding.inflate(LayoutInflater.from(context), this, true);
  }

}
