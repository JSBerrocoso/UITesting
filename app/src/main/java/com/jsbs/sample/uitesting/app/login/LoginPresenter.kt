package com.jsbs.sample.uitesting.app.login

import android.os.Handler

/**
 * Created by patxi on 02/11/2017.
 */
class LoginPresenter(var loginView: LoginContract.View) : LoginContract.UserActionListener {

  override fun loginButtonClick() {
    loginView.showProgress(true)

    val handler = Handler()
    handler.postDelayed({
      loginView.showProgress(false)
      loginView.showLoginSuccessScreen()
    }, 3000)
  }

  override fun createAccountButtonClick() {
    loginView.showCreateAccountScreen()
  }

}