package com.diegosantos.mvp_mvvm_example.mvvm

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.diegosantos.mvp_mvvm_example.model.RandomNumberRepository

/**
 * Created by diegosantos on 3/27/18.
 */
class ViewModelFactory(private val repository: RandomNumberRepository)
    : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SampleViewModel::class.java)) {
            return SampleViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}