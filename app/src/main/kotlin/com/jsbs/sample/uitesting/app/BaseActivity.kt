package com.jsbs.sample.uitesting.app

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by patxi on 02/11/2017.
 */
open class BaseActivity : AppCompatActivity(){

  fun startFragment(fragment: Fragment) {
    val fragmentManager = supportFragmentManager
    val fragmentTransaction = fragmentManager.beginTransaction()
    fragmentTransaction.replace(R.id.container, fragment)
    fragmentTransaction.commit()
  }
}