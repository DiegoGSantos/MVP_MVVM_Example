package com.diegosantos.mvp_mvvm_example.mvvm

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.diegosantos.mvp_mvvm_example.model.RandomNumberRepository

/**
 * Created by diegosantos on 3/26/18.
 */
class SampleViewModel(val randomNumberRepository: RandomNumberRepository): ViewModel() {
    val currentRandomNumber = ObservableField("")

    fun getRandomNumber() {
        currentRandomNumber.set(randomNumberRepository.getRandomNumber().toString())
    }
}