package com.github.jmfayard.okandroid.phone

import android.content.Context
import com.github.jmfayard.okandroid.R
import com.wealthfront.magellan.Screen

class RegisterScreen : Screen<RegisterView>() {

    override fun createView(context: Context): RegisterView
            = RegisterView(context)

    override fun getTitle(context: Context?): String
            = context!!.getString(R.string.register_phone)

    fun enterVerification() {
        navigator.goTo(VerificationScreen())
    }

    override fun onPause(context: Context?) {
        view.registerClicks()
    }

    override fun onResume(context: Context?) {
        view.removeClicks()
    }
}
