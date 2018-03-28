package com.diegosantos.mvp_mvvm_example

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.diegosantos.mvp_mvvm_example.mvp.MVPRandomNumberActivity
import com.diegosantos.mvp_mvvm_example.mvvm.MVVMRandomNumberActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btOpenMVP.setOnClickListener {
            startActivity(Intent(this, MVPRandomNumberActivity::class.java))
        }

        btOpenMVVM.setOnClickListener({
            startActivity(Intent(this, MVVMRandomNumberActivity::class.java))
        })
    }
}
