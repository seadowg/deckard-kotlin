package com.github.jmfayard.okandroid.phone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.github.jmfayard.okandroid.databinding.RegisterBinding
import com.wealthfront.magellan.BaseScreenView

class RegisterView(context: Context) : BaseScreenView<RegisterScreen>(context) {
    val binding = RegisterBinding.inflate(LayoutInflater.from(context), this, true)

    fun registerClicks() {
        binding.sendSms.setOnClickListener { screen.enterVerification() }
    }

    fun removeClicks() {
        listOf(binding.sendSms).forEach { view ->
            view.setOnClickListener(null)
        }
    }
}
