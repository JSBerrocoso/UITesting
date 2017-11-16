package com.jsbs.sample.uitesting.app.login.pageobject

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.replaceText
import android.support.test.espresso.action.ViewActions.scrollTo
import android.support.test.espresso.matcher.ViewMatchers.withId
import com.jsbs.sample.uitesting.app.R
import com.jsbs.sample.uitesting.app.R.id

class LoginPageObject : BasePageObject {
  constructor() : super(R.id.activity_login)

  fun doLogin(email: String, pass: String): SuccessPageObject {
    onView(withId(id.email)).perform(scrollTo(), replaceText(email))
    onView(withId(id.password)).perform(scrollTo(), replaceText(pass))
    pressSignUpView()
    sleepFakeTime()
    return SuccessPageObject()
  }

  fun navigateToSignUp(): SignUpPageObject {
    onView(withId(id.create_account)).perform(scrollTo(), click())
    return SignUpPageObject()
  }

  fun pressSignUpView(): LoginPageObject {
    onView(withId(R.id.email_sign_in_button)).perform(click())
    return this
  }

}