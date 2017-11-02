package com.jsbs.sample.uitesting.app.login;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import com.jsbs.sample.uitesting.app.BaseActivityTest;
import com.jsbs.sample.uitesting.app.R;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest @RunWith(AndroidJUnit4.class) public class LoginActivityTest extends BaseActivityTest {

  private static final String EMAIL = "santiago.berrocoso@gigigo.com";
  private static final String PASS = "fakepass1";

  @Rule public ActivityTestRule<LoginActivity> mActivityTestRule =
      new ActivityTestRule<>(LoginActivity.class);

  private Context instrumentationCtx;

  @Before public void setup() {
    this.instrumentationCtx = InstrumentationRegistry.getContext();
  }

  @Test public void clickSignUpButton_openSignUpScreen() {
    // Find Textview with text "Not account yet? Create one".
    ViewInteraction appCompatTextView = onView(
        allOf(withId(R.id.create_account), withText("Not account yet? Create one"), childAtPosition(
            allOf(withId(R.id.email_login_form), childAtPosition(withId(R.id.scroll_login_form), 0)), 3)));
    appCompatTextView.perform(scrollTo(), click());

    // Check if the SignUp screen is displayed
    ViewInteraction textView = onView(allOf(withText("Create your account"), childAtPosition(
        allOf(withId(R.id.action_bar), childAtPosition(withId(R.id.action_bar_container), 0)), 0),
        isDisplayed()));
    textView.check(matches(withText("Create your account")));
  }

  @Test public void clickSignInButtonAfterFillingSignInForm_showProgressAndSuccessScreen() {

    // Find email editext and set data
    ViewInteraction viewInteractionEmail = onView(allOf(withId(R.id.email),
        childAtPosition(
            childAtPosition(withClassName(is("android.support.design.widget.TextInputLayout")), 0),
            0)));
    viewInteractionEmail.perform(scrollTo(), click());
    viewInteractionEmail.perform(scrollTo(), replaceText(EMAIL), closeSoftKeyboard());

    // Find email password and set data
    ViewInteraction viewInteractionPassword = onView(allOf(withId(R.id.password), childAtPosition(
        childAtPosition(withClassName(is("android.support.design.widget.TextInputLayout")), 0),
        0)));
    viewInteractionPassword.perform(scrollTo(), replaceText(PASS), closeSoftKeyboard());

    // Find SignInButton
    ViewInteraction viewInteractionSignInButton = onView(
        allOf(withId(R.id.email_sign_in_button), withText("Sign in"), childAtPosition(
            allOf(withId(R.id.email_login_form),
                childAtPosition(withId(R.id.scroll_login_form), 0)), 2)));
    viewInteractionSignInButton.perform(scrollTo(), click());

    // Added a sleep statement to match the app's execution delay.
    // The recommended way to handle such scenarios is to use Espresso idling resources:
    // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Check if the Success screen is displayed
    ViewInteraction viewInteractionSuccessView = onView(
        allOf(withId(R.id.title_success_screen), withText("Success!!!"),
            childAtPosition(childAtPosition(withId(android.R.id.content), 0), 0), isDisplayed()));
    viewInteractionSuccessView.check(matches(withText("Success!!!")));
  }

}
