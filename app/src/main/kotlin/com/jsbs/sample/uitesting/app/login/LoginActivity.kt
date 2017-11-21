package com.jsbs.sample.uitesting.app.login

import android.os.Bundle
import com.jsbs.sample.uitesting.app.BaseActivity
import com.jsbs.sample.uitesting.app.R.layout


/**
 * Created by patxi on 02/11/2017.
 */
class LoginActivity : BaseActivity(){

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_login)

    startFragment(LoginFragment.newInstance())
  }
}
