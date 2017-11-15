/*
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
 *
 */

package com.jsbs.sample.uitesting.app.login

import android.os.Handler
import com.jsbs.sample.uitesting.app.TIMES

class LoginPresenter(private var loginView: LoginContract.View) : LoginContract.UserActionListener {

  override fun loginButtonClick(name: String, password: String) {

    if (isValidCredentials(name, password)) {
      loginView.showProgress(true)

      val handler = Handler()
      handler.postDelayed({
        loginView.showProgress(false)
        loginView.showLoginSuccessScreen()
      }, TIMES.SLEEP_TIME_MILLIS)
    } else {
      loginView.showInvalidCredentialsViews()
    }
  }

  override fun createAccountButtonClick() {
    loginView.showCreateAccountScreen()
  }

  private fun isValidCredentials(name: String, password: String): Boolean {
    var result = true
    if (name.isEmpty()) {
      result = false
      loginView.showInvalidEmail()
    } else if (password.isEmpty()) {
      result = false
      loginView.showInvalidPassword()
    }
    return result;
  }
}


