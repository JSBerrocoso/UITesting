package com.jsbs.sample.uitesting.app.login

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import com.jsbs.sample.uitesting.app.R

/**
 * Created by patxi on 02/11/2017.
 */
class LoginFragment : Fragment() {

  private lateinit var emailEditext: EditText
  private lateinit var passEditext: EditText
  private lateinit var mProgressBar: ProgressBar
  private lateinit var signButton: Button

  companion object {
    fun newInstance(): LoginFragment = LoginFragment()
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater?.inflate(R.layout.login_fragment, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    emailEditext = view.findViewById(R.id.email)
    passEditext = view.findViewById(R.id.password)
    mProgressBar = view.findViewById(R.id.login_progress)
    signButton = view.findViewById(R.id.email_sign_in_button)
  }
}
