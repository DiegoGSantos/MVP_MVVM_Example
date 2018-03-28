package com.diegosantos.mvp_mvvm_example.mvp

import com.diegosantos.mvp_mvvm_example.model.RandomNumberRepository

/**
 * Created by diegosantos on 3/25/18.
 */
class SamplePresenter(val view: View, val randomNumberRepository: RandomNumberRepository): Presenter {

    override fun getRandomNumber() {
        view.updateUI(randomNumberRepository.getRandomNumber().toString())
    }

}