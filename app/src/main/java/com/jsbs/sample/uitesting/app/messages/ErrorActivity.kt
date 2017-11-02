package com.jsbs.sample.uitesting.app.messages

import android.os.Bundle
import com.jsbs.sample.uitesting.app.BaseActivity
import com.jsbs.sample.uitesting.app.R.layout

/**
 * Created by patxi on 02/11/2017.
 */
open class ErrorActivity : BaseActivity(){

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_error)
  }
}