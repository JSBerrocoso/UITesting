package com.jsbs.sample.uitesting.app.signup

/**
 * Created by patxi on 02/11/2017.
 */
interface SignUpContract {
  interface View {
    fun showProgress(showProgress: Boolean)
    fun showSignUpSuccessScreen()
  }

  interface UserActionListener {
    fun signUpButtonClick()
  }
}