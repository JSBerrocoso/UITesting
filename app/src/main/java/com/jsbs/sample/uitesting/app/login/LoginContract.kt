package com.jsbs.sample.uitesting.app.login

/**
 * Created by patxi on 02/11/2017.
 */
interface LoginContract {
  interface View {
    fun showProgress(showProgress: Boolean)
    fun showLoginSuccessScreen()
    fun showCreateAccountScreen()
  }

  interface UserActionListener {

    fun loginButtonClick()
    fun createAccountButtonClick();
  }
}