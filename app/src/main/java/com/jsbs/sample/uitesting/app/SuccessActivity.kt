package com.jsbs.sample.uitesting.app

import android.os.Bundle
import com.jsbs.sample.uitesting.app.R.layout
import com.jsbs.sample.uitesting.app.messages.MessageActivity

/**
 * Created by patxi on 02/11/2017.
 */
open class SuccessActivity : MessageActivity(){

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_success)
  }
}