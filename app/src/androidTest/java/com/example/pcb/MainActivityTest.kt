package com.example.pcb

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
        scenario = launchActivity()
        scenario.moveToState(Lifecycle.State.RESUMED)
    }

    @Test
    fun checkMainActivityButton() {
        onView(withId(R.id.start_button)).perform(click())
    }

    @Test
    fun checkSecondActivityButtons() {
        onView(withId(R.id.start_button)).perform(click())
        onView(withId(R.id.mobo_button)).check(matches(isDisplayed()))
        onView(withId(R.id.psu_button)).check(matches(isDisplayed()))
        onView(withId(R.id.ram_button)).check(matches(isDisplayed()))
        onView(withId(R.id.tower_button)).check(matches(isDisplayed()))
        onView(withId(R.id.fan_button)).check(matches(isDisplayed()))
        onView(withId(R.id.disk_button)).check(matches(isDisplayed()))
        onView(withId(R.id.cpu_button)).check(matches(isDisplayed()))
        onView(withId(R.id.gpu_button)).check(matches(isDisplayed()))
        onView(withId(R.id.switch_intel_amd)).check(matches(isDisplayed()))
    }
}