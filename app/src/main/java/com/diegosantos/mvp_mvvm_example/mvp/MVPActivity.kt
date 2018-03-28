package com.diegosantos.mvp_mvvm_example.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.diegosantos.mvp_mvvm_example.R
import com.diegosantos.mvp_mvvm_example.model.RandomNumberRepository
import kotlinx.android.synthetic.main.activity_mvp.*

class MVPRandomNumberActivity : AppCompatActivity(), View {

    val presenter = SamplePresenter(this, RandomNumberRepository())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        btRegenerate.setOnClickListener({
            presenter.getRandomNumber()
        })

        presenter.getRandomNumber()
    }

    override fun updateUI(RandomNumber: String) {
        tvRandomNumber.text = RandomNumber
    }
}
