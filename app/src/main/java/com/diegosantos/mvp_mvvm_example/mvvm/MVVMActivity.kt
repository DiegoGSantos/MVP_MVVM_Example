package com.diegosantos.mvp_mvvm_example.mvvm

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.diegosantos.mvp_mvvm_example.R
import com.diegosantos.mvp_mvvm_example.databinding.ActivityMvvmBinding
import com.diegosantos.mvp_mvvm_example.model.RandomNumberRepository

class MVVMRandomNumberActivity : AppCompatActivity() {

    lateinit var binding: ActivityMvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)
        binding.viewModel = viewModel()
        viewModel()?.getRandomNumber()
    }

    private fun viewModel(): SampleViewModel? {
        return ViewModelProviders.of(this,
                ViewModelFactory(RandomNumberRepository()))
                .get(SampleViewModel::class.java)
    }
}
