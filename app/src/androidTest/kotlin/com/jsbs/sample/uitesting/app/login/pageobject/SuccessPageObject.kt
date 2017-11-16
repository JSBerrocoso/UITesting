package com.jsbs.sample.uitesting.app.login.pageobject

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.jsbs.sample.uitesting.app.R

class SuccessPageObject: BasePageObject {
  constructor() : super(R.id.success_activity)

  fun checkTitle(title: String){
    onView(withText(title)).check(matches( isDisplayed()))
  }
}