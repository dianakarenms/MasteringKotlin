package com.journaler.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.journaler.R

abstract class ItemActivity : BaseActivity() {
    override fun getActivityTitle() = R.string.app_name
}
