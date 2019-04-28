package com.example.test

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.R
import com.example.activity.DeckardActivity
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [28])
class DeckardActivityTest {

    @Test
    fun testSomething() {
        ActivityScenario.launch(DeckardActivity::class.java)!!.use { scenario ->
            scenario.onActivity { activity ->
                assertEquals("Hello, Kotlin!", activity.getString(R.string.hello_kotlin))
            }
        }
    }
}
