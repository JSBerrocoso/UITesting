package com.jsbs.sample.uitesting.app.login

import android.support.test.espresso.IdlingRegistry
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.jsbs.sample.uitesting.app.BaseActivityTest
import com.jsbs.sample.uitesting.app.login.pageobject.LoginPageObject
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class LoginActivityWithPageObjectTest : BaseActivityTest() {

  @Rule
  @JvmField
  val testRule: ActivityTestRule<LoginActivity> = ActivityTestRule<LoginActivity>(
      LoginActivity::class.java)

  @Test
  fun clickSignUpButton_openSignUpScreen() {
    LoginPageObject()
        .pressSignUpView()
        .navigateToSignUp()
  }

  @Test
  fun clickSignInButtonAfterFillingSignInForm_showProgressAndSuccessScreen() {
    LoginPageObject()
        .doLogin("santiago.berrocoso@gigigo.com", "fakepass1")
  }

  /**
   * Prepare your test fixture for this test. In this case we register an IdlingResources with
   * Espresso. IdlingResource resource is a great way to tell Espresso when your app is in an
   * idle state. This helps Espresso to synchronize your test actions, which makes tests significantly
   * more reliable.
   */
  @Before
  fun registerIdlingResource() {
    IdlingRegistry.getInstance().register( testRule.getActivity().getEspressoIdlingResources())
  }
}