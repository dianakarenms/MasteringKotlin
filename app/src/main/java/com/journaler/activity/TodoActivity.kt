package com.journaler.activity

import com.journaler.R

class TodoActivity : ItemActivity() {
    override val tag = "Todo Activity"
    override fun getLayout() = R.layout.activity_todo
}
