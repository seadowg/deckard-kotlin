package com.github.jmfayard.okandroid.phone

import android.content.Context
import com.github.jmfayard.okandroid.HomeScreen
import com.wealthfront.magellan.Screen

class VerificationScreen : Screen<VerificationView>() {

    override fun getTitle(context: Context?): String {
        return "Verify your phone number"
    }

    override fun createView(context: Context): VerificationView {
        return VerificationView(context)
    }

    override fun onPause(context: Context?) {
        view.setupClicks()
    }

    override fun onResume(context: Context?) {
        view.removeClicks()
    }

    fun verify(pin: String) {
        if ("123" == pin) {
            view.toast("Success, you are now connected!")
            navigator.goTo(HomeScreen())
        } else {
            view.toast("Error, you did not entered 123!")
        }
    }

    fun verifyResendSMS() {
        navigator.goBack()
    }
}
