package com.jsbs.sample.uitesting.app.login

/**
 * Copyright 2017 JSBerrocoso
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.closeSoftKeyboard
import android.support.test.espresso.action.ViewActions.replaceText
import android.support.test.espresso.action.ViewActions.scrollTo
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withClassName
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.view.View
import com.jsbs.sample.uitesting.app.BaseActivityTest
import com.jsbs.sample.uitesting.app.R
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class LoginActivityTest : BaseActivityTest() {

  @Rule @JvmField
  val testRule: ActivityTestRule<LoginActivity> = ActivityTestRule<LoginActivity>(LoginActivity::class.java)

  var instrumentationCtx: Context? = null

  @Before
  fun setup() {
    this.instrumentationCtx = InstrumentationRegistry.getContext()
  }

  @Test
  fun clickSignUpButton_openSignUpScreen() {
    // Find Textview with text "Not account yet? Create one".
    val appCompatTextView = onView(
        allOf<View>(withId(R.id.create_account), withText("Not account yet? Create one"),
            childAtPosition(
                allOf<View>(withId(R.id.email_login_form),
                    childAtPosition(withId(R.id.scroll_login_form), 0)), 3)))
    appCompatTextView.perform(scrollTo(), click())

    // Check if the SignUp screen is displayed
    val textView = onView(
        allOf<View>(withText("Create your account"), childAtPosition(
            allOf<View>(withId(R.id.action_bar), childAtPosition(withId(R.id.action_bar_container), 0)), 0),
            isDisplayed()))
    textView.check(matches(withText("Create your account")))
  }

  @Test
  fun clickSignInButtonAfterFillingSignInForm_showProgressAndSuccessScreen() {

    // Find email editext and set data
    val viewInteractionEmail = onView(
        allOf<View>(withId(R.id.email), childAtPosition(
            childAtPosition(
                withClassName(`is`("android.support.design.widget.TextInputLayout")), 0),
            0)))
    viewInteractionEmail.perform(scrollTo(), click())
    viewInteractionEmail.perform(scrollTo(), replaceText(EMAIL), closeSoftKeyboard())

    // Find email password and set data
    val viewInteractionPassword = onView(
        allOf<View>(withId(R.id.password), childAtPosition(
            childAtPosition(
                withClassName(`is`("android.support.design.widget.TextInputLayout")), 0),
            0)))
    viewInteractionPassword.perform(scrollTo(), replaceText(PASS), closeSoftKeyboard())

    // Find SignInButton
    val viewInteractionSignInButton = onView(
        allOf<View>(withId(R.id.email_sign_in_button), withText("Sign in"),
            childAtPosition(
                allOf<View>(withId(R.id.email_login_form),
                    childAtPosition(withId(R.id.scroll_login_form), 0)), 2)))
    viewInteractionSignInButton.perform(scrollTo(), click())

    // Added a sleep statement to match the app's execution delay.
    // The recommended way to handle such scenarios is to use Espresso idling resources:
    // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
    try {
      Thread.sleep(3000)
    } catch (e: InterruptedException) {
      e.printStackTrace()
    }

    // Check if the Success screen is displayed
    val viewInteractionSuccessView = onView(
        allOf<View>(withId(R.id.title_success_screen), withText("Success!!!"), childAtPosition(
            childAtPosition(withId(android.R.id.content), 0), 0),
            isDisplayed()))
    viewInteractionSuccessView.check(matches(withText("Success!!!")))
  }

  companion object {

    private val EMAIL = "santiago.berrocoso@gigigo.com"
    private val PASS = "fakepass1"
  }
}
