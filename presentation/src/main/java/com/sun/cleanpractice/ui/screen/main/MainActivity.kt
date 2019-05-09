package com.sun.cleanpractice.ui.screen.main

import android.os.Bundle
import com.sun.cleanpractice.R
import com.sun.cleanpractice.ui.base.BaseActivity
import com.sun.cleanpractice.ui.base.BaseViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<BaseViewModel>() {

    override val viewModel: MainViewModel by viewModel()

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
