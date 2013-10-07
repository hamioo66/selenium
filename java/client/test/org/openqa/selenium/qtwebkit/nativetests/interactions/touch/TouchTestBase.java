package org.openqa.selenium.qtwebkit.nativetests.interactions.touch;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assume.assumeThat;

import org.junit.Before;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.testing.JUnit4TestBase;

public abstract class TouchTestBase extends JUnit4TestBase {
    @Before
    public void checkHasTouchScreen() {
        assumeThat(driver, instanceOf(HasTouchScreen.class));
    }
}