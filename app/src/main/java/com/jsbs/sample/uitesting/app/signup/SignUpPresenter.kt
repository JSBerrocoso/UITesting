package com.jsbs.sample.uitesting.app.signup

import android.os.Handler

/**
 * Created by patxi on 02/11/2017.
 */
class SignUpPresenter(var signUpView: SignUpContract.View) : SignUpContract.UserActionListener {
  override fun signUpButtonClick() {
    signUpView.showProgress(true)

    val handler = Handler()
    handler.postDelayed({
      signUpView.showProgress(false)
      signUpView.showSignUpSuccessScreen()
    }, 3000)
  }

}