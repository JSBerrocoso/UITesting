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

/**
 * Created by patxi on 02/11/2017.
 */
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
        actionListener.loginButtonClick()
      }
    }
  }

  override fun showProgress(showProgress: Boolean) {
    when {
      showProgress -> progressBar.visibility = View.VISIBLE
      else -> progressBar.visibility = View.INVISIBLE
    }
  }

  override fun showLoginSuccessScreen() {
    navigateToSuccessScreen()
  }

  override fun showCreateAccountScreen() {
    navigateToCreateAccountScreen()
  }

}
