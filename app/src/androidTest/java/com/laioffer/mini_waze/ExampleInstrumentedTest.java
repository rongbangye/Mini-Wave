package com.laioffer.mini_waze;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<ControlPanel> activityTestRule =
            new ActivityTestRule<>(ControlPanel.class);

    @Test
    public void verifyMiniWaze() {
        onView(withText("MiniWaze")).check(matches(isDisplayed()));
    }

    @Test
    public void verifySend() {
        onView(withId(R.id.fab)).perform(click());

        onView(withText("Police")).perform(click());

        onView(withText("SEND")).check(matches(isDisplayed()));
    }

}

