package com.github.jmfayard.okandroid.phone

import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import com.github.jmfayard.okandroid.databinding.VerifyBinding
import com.wealthfront.magellan.BaseScreenView

class VerificationView(context: Context) : BaseScreenView<VerificationScreen>(context) {
    val binding: VerifyBinding = VerifyBinding.inflate(LayoutInflater.from(context), this, true)


    fun pin(): String = binding.pin.text.toString()

    fun toast(s: String) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show()
    }

    fun setupClicks() {
        binding.verifyResendSMS.setOnClickListener { screen.verifyResendSMS() }
        binding.verfiyPin.setOnClickListener { screen.verify(pin()) }
    }

    fun removeClicks() {
        listOf(binding.verfiyPin, binding.verifyResendSMS).forEach { view ->
            view.setOnClickListener(null)
        }
    }
}
