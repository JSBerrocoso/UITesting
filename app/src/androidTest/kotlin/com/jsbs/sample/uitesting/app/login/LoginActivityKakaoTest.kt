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

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.jsbs.sample.uitesting.app.TIMES
import com.jsbs.sample.uitesting.app.login.screen.LoginScreen
import com.jsbs.sample.uitesting.app.login.screen.SuccessScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityKakaoTest {

  @Rule
  @JvmField
  val rule = ActivityTestRule(LoginActivity::class.java)

  val loginScreen = LoginScreen()

  val successScreen = SuccessScreen()

  @Test
  fun clickSignInButtonAfterFillingSignInForm_showProgressAndSuccessScreen() {

    loginScreen {
      email {
        replaceText(LoginActivityTest.EMAIL)
      }
      password {
        replaceText(LoginActivityTest.PASS)
      }

      loginButton {
        click()
      }

      Thread.sleep(TIMES.SLEEP_TIME_MILLIS)
    }

    successScreen {
      title { isDisplayed() }
    }
  }


}