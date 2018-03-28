package com.diegosantos.mvp_mvvm_example.mvp

/**
 * Created by diegosantos on 3/25/18.
 */
interface View {
    fun updateUI(RandomNumber: String);
}

interface Presenter {
    fun getRandomNumber()
}