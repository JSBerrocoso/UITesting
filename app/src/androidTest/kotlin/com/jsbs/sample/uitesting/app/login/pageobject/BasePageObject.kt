package com.jsbs.sample.uitesting.app.login.pageobject

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.withId

open class BasePageObject {

  constructor(resourceIdName: Int) {
    Espresso.onView(withId(resourceIdName)).check(
        ViewAssertions.matches(ViewMatchers.isDisplayed()))
  }

  fun <T : BasePageObject> `is`(type: Class<T>): T {
    if (type.isInstance(this)) {
      return type.cast(this)
    } else {
      throw InvalidPageException(
          "Invalid page type. Expected: " + type.simpleName + ", but got: " + this.javaClass.simpleName)
    }
  }

  class InvalidPageException(message: String) : RuntimeException(message)


  fun sleepFakeTime() {
    try {
      Thread.sleep(3000)
    } catch (e: InterruptedException) {
      e.printStackTrace()
    }
  }
}