package com.example.test

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.example.activity.DeckardActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DeckardTest {

    @get:Rule
    val activityTestRule = ActivityTestRule(DeckardActivity::class.java)


    @Test
    fun saysHello() {
        onView(withText("Hello, Kotlin!")).check(matches(isDisplayed()))
    }
}
