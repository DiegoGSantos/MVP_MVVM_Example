package com.diegosantos.mvp_mvvm_example.model

import java.util.*

/**
 * Created by diegosantos on 3/27/18.
 */
class RandomNumberRepository() {
    fun getRandomNumber(): Int {
        return Random().nextInt(100 + 1 - 1) + 1
    }
}