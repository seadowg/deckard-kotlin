package com.github.jmfayard.okandroid

import android.content.Context
import android.view.LayoutInflater
import com.wealthfront.magellan.BaseScreenView
import com.wealthfront.magellan.Screen

class AirbnbScreen : Screen<AirbnbView>() {
    override fun createView(context: Context) = AirbnbView(context)

    override fun getTitle(context: Context?): String = "Airbnb Login"
}


class AirbnbView(context: Context) : BaseScreenView<AirbnbScreen>(context) {

    init {
        LayoutInflater.from(context).inflate(R.layout.airbnb_login, this, true)
    }

}