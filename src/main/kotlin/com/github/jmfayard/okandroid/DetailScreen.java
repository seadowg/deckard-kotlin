package com.github.jmfayard.okandroid;

import android.content.Context;
import com.wealthfront.magellan.Screen;

public class DetailScreen extends Screen<DetailView> {

  @Override
  protected DetailView createView(Context context) {
    return new DetailView(context);
  }

  @Override
  public String getTitle(Context context) {
    return "Detail Screen";
  }

}
