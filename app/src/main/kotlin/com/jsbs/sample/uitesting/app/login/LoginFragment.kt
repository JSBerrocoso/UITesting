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


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import com.jsbs.sample.uitesting.app.BaseFragment
import com.jsbs.sample.uitesting.app.R

class LoginFragment : BaseFragment(), LoginContract.View, OnClickListener {

  private lateinit var emailEditext: EditText
  private lateinit var passEditext: EditText
  private lateinit var progressBar: ProgressBar
  private lateinit var signButton: Button
  private lateinit var actionListener: LoginPresenter
  private lateinit var createAccountButton: TextView

  companion object {
    fun newInstance(): LoginFragment = LoginFragment()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    actionListener = LoginPresenter(this)
  }


  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.login_fragment, container, false)

    emailEditext = view.findViewById(R.id.email)
    passEditext = view.findViewById(R.id.password)
    progressBar = view.findViewById(R.id.login_progress)
    createAccountButton = view.findViewById(R.id.create_account)
    createAccountButton.setOnClickListener(this)
    signButton = view.findViewById(R.id.email_sign_in_button)
    signButton.setOnClickListener(this)

    return view
  }

  override fun onClick(viewOnClick: View) {

    when (viewOnClick.id) {
      R.id.create_account -> {
        actionListener.createAccountButtonClick()
      }
      R.id.email_sign_in_button -> {
        actionListener.loginButtonClick(emailEditext.text.toString(), passEditext.text.toString())
      }
    }
  }

  override fun showProgress(show: Boolean) {
    when {
      show -> progressBar.visibility = View.VISIBLE
      else -> progressBar.visibility = View.INVISIBLE
    }
    enableClickableViews(!show)
  }

  override fun showLoginSuccessScreen() {
    navigateToSuccessScreen()
  }

  override fun showCreateAccountScreen() {
    navigateToCreateAccountScreen()
  }

  override fun showInvalidEmail() {
    emailEditext.error = getString(R.string.error_invalid_email)
  }

  override fun showInvalidPassword() {
    passEditext.error = getString(R.string.error_invalid_password)
  }

  override fun showInvalidCredentialsViews() {
    emailEditext.error = getString(R.string.error_invalid_email)
    passEditext.error = getString(R.string.error_invalid_password)
  }

  override fun enableClickableViews(enableView: Boolean) {
    signButton.isEnabled = enableView
  }

}
