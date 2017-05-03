package com.github.jmfayard.okandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.github.jmfayard.okandroid.databinding.HomeBinding;
import com.wealthfront.magellan.BaseScreenView;

public class HomeView extends BaseScreenView<HomeScreen> {

  HomeView(Context context) {
    super(context);
    //inflate(context, R.layout.home, this);
    final HomeBinding binding = HomeBinding.inflate(LayoutInflater.from(context), this, true);

    binding.actionRegister.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        getScreen().openRegisterScreen();
      }
    });
    binding.defaultTransitionButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getScreen().defaultTransitionButtonClicked();
      }
    });
    binding.circularRevealTransitionButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getScreen().circularRevealTransitionButtonClicked(binding.circularRevealTransitionButton);
      }
    });
    binding.showTransitionButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getScreen().showTransitionButtonClicked();
      }
    });
    binding.showNowTransitionButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getScreen().showNowTransitionButtonClicked();
      }
    });

    binding.actionAirbnb.setOnClickListener(new OnClickListener() {
      @Override public void onClick(View v) {
        getScreen().showAirbnbViews();
      }
    });
  }

}
