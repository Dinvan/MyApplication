package com.advanz101.myapplication.activity;

import android.support.design.widget.FloatingActionButton;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.TextView;

import com.advanz101.myapplication.MainActivity;
import com.advanz101.myapplication.R;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by advanz101 on 15/9/17.
 */
import android.app.Instrumentation;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    private IntentServiceIdlingResource idlingResource;

    @Before
    public void registerIntentServiceIdlingResource() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        idlingResource = new IntentServiceIdlingResource(instrumentation.getTargetContext());
        Espresso.registerIdlingResources(idlingResource);
    }

    @After
    public void unregisterIntentServiceIdlingResource() {
        Espresso.unregisterIdlingResources(idlingResource);
    }

    @Test
    public void hello() {
        onView(withId(R.id.input))
                .perform(typeText("hello"));
        onView(withId(R.id.repeat_button))
                .perform(click());
        onView(withId(R.id.output))
                .check(matches(withText("hello\nhello")));
    }
}

