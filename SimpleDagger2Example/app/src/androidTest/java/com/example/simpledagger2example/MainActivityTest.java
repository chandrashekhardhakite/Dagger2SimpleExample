/*
 * @Chandra Dhakite
 */

package com.example.simpledagger2example;

import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.simpledagger2example.mocks.DaggerMyComponentMock;
import com.example.simpledagger2example.mocks.MyModuleMock;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class) {

        @Override
        protected void beforeActivityLaunched() {
            MyApplication application = (MyApplication) InstrumentationRegistry
                    .getInstrumentation()
                    .getTargetContext()
                    .getApplicationContext();
            MyComponent myComponent = DaggerMyComponentMock
                    .builder()
                    .myModuleMock(new MyModuleMock())
                    .build();
            application.setMyComponent(myComponent);
        }

    };

    @Test
    public void formattedDateShown() {
        onView(withId(R.id.datetime)).check(matches(withText("Wed Dec 31 19:00:00 EST 1969")));
    }
}