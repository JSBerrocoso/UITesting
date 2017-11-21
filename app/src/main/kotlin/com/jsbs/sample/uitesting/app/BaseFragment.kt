package com.jsbs.sample.uitesting.app

import android.content.Intent
import android.support.v4.app.Fragment
import com.jsbs.sample.uitesting.app.messages.ErrorActivity
import com.jsbs.sample.uitesting.app.messages.MessageActivity
import com.jsbs.sample.uitesting.app.signup.SignUpActivity

/**
 * Created by patxi on 02/11/2017.
 */
open class BaseFragment : Fragment(){

  fun navigateToSuccessScreen(){
    val intent = Intent(activity, SuccessActivity::class.java)
    intent.putExtra(MessageActivity.STATUS_MESSAGE, getString(R.string.text_login_successful))
    startActivity(intent)
  }
  fun navigateToErrorScreen(){
    val intent = Intent(activity, ErrorActivity::class.java)
    intent.putExtra(MessageActivity.STATUS_MESSAGE, getString(R.string.text_login_successful))
    startActivity(intent)
  }

  fun navigateToCreateAccountScreen() {
    val intent = Intent(activity, SignUpActivity::class.java)
    startActivity(intent)
  }
}