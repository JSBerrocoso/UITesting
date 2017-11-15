package com.jsbs.sample.uitesting.app.signup;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import com.jsbs.sample.uitesting.app.BaseActivityTest;
import com.jsbs.sample.uitesting.app.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest @RunWith(AndroidJUnit4.class) public class SignUpActivityTest extends BaseActivityTest {

  private static final String FIRST_NAME_VALUE = "Perico";
  private static final String LAST_NAME_VALUE = "el de los palotes";
  private static final String EMAIL_NAME_VALUE = "eldelospalotes@gmail.com";
  private static final String PASS_NAME_VALUE = "fakepass";

  @Rule public ActivityTestRule<SignUpActivity> mActivityTestRule = new ActivityTestRule<>(SignUpActivity.class);

  @Test public void clickSignUpButtonAfterFillSignUpForm_showProgressAndSuccessScreen() {

    ViewInteraction viewInteractionFirstName = onView(allOf(withId(R.id.edit_text_first_name),
        childAtPosition(
            childAtPosition(withClassName(is("android.support.design.widget.TextInputLayout")), 0),
            0), isDisplayed()));
    viewInteractionFirstName.perform(replaceText(FIRST_NAME_VALUE), closeSoftKeyboard());

    ViewInteraction viewInteractionLastName = onView(allOf(withId(R.id.edit_text_last_name),
        childAtPosition(
            childAtPosition(withClassName(is("android.support.design.widget.TextInputLayout")), 0),
            0), isDisplayed()));
    viewInteractionLastName.perform(replaceText(LAST_NAME_VALUE), closeSoftKeyboard());

    ViewInteraction textInputEditText4 = onView(allOf(withId(R.id.edit_text_email), childAtPosition(
        childAtPosition(withClassName(is("android.support.design.widget.TextInputLayout")), 0), 0),
        isDisplayed()));
    textInputEditText4.perform(replaceText(EMAIL_NAME_VALUE), closeSoftKeyboard());

    ViewInteraction viewInteractionPassword = onView(allOf(withId(R.id.edit_text_password),
        childAtPosition(
            childAtPosition(withClassName(is("android.support.design.widget.TextInputLayout")), 0),
            0), isDisplayed()));
    viewInteractionPassword.perform(replaceText(PASS_NAME_VALUE), closeSoftKeyboard());

    ViewInteraction viewInteractionSignUpButton = onView(
        allOf(withId(R.id.button_sign_up), withText("Sign Up"), childAtPosition(
            allOf(withId(R.id.layout_sign_up), childAtPosition(withId(R.id.container), 0)), 5),
            isDisplayed()));
    viewInteractionSignUpButton.perform(click());

    // Added a sleep statement to match the app's execution delay.
    // The recommended way to handle such scenarios is to use Espresso idling resources:
    // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    ViewInteraction viewInteractionSuccessText = onView(
        allOf(withId(R.id.title_success_screen), withText("Success!!!"),
            childAtPosition(childAtPosition(withId(android.R.id.content), 0), 0), isDisplayed()));
    viewInteractionSuccessText.check(matches(withText("Success!!!")));
  }
}
