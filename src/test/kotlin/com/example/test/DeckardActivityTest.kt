package com.example.test

import com.example.BuildConfig
import com.example.activity.DeckardActivity

import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config

import org.junit.Assert.assertTrue

@RunWith(RobolectricGradleTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(21))
class DeckardActivityTest {

    @Test
    fun testSomething() {
        assertTrue(Robolectric.setupActivity(DeckardActivity::class.java) != null)
    }
}
