package com.example.pcb
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
private lateinit var  scenario: ActivityScenario<MainActivity>
@Before
fun setup(){
    scenario = launchActivity()
    scenario.moveToState(Lifecycle.State.RESUMED)
}
    @Test
    fun checkActivity(){
        onView(withId(R.id.start_button)).perform(click())
    }
}