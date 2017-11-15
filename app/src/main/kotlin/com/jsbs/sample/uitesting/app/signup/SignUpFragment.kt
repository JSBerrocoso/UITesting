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

package com.jsbs.sample.uitesting.app.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import com.jsbs.sample.uitesting.app.BaseFragment
import com.jsbs.sample.uitesting.app.R
import com.jsbs.sample.uitesting.app.R.layout

class SignUpFragment : BaseFragment(), SignUpContract.View, OnClickListener {

  private lateinit var firstNameEditext: EditText
  private lateinit var lastNameEditext: EditText
  private lateinit var emailEditext: EditText
  private lateinit var passEditext: EditText

  private lateinit var progressBar: ProgressBar
  private lateinit var signButton: Button
  private lateinit var actionListener: SignUpPresenter

  companion object {
    fun newInstance(): SignUpFragment = SignUpFragment()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    actionListener = SignUpPresenter(this)
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): android.view.View? {
    val view = inflater.inflate(layout.signup_fragment, container, false)

    firstNameEditext = view.findViewById(R.id.edit_text_first_name)
    lastNameEditext = view.findViewById(R.id.edit_text_last_name)
    emailEditext = view.findViewById(R.id.edit_text_email)
    passEditext = view.findViewById(R.id.edit_text_password)

    progressBar = view.findViewById(R.id.progress_bar_indeterminate)
    signButton = view.findViewById(R.id.button_sign_up)
    signButton.setOnClickListener(this)

    return view
  }

  override fun onClick(viewOnClick: android.view.View) {
    when (viewOnClick.id) {
      R.id.button_sign_up -> {
        actionListener.signUpButtonClick()
      }
    }
  }

  override fun showProgress(showProgress: Boolean) {
    when {
      showProgress -> progressBar.visibility = android.view.View.VISIBLE
      else -> progressBar.visibility = android.view.View.INVISIBLE
    }
  }

  override fun showSignUpSuccessScreen() {
    navigateToSuccessScreen()
  }
}