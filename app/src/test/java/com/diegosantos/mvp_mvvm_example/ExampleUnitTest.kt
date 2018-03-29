package com.diegosantos.mvp_mvvm_example

import com.diegosantos.mvp_mvvm_example.model.RandomNumberRepository
import com.diegosantos.mvp_mvvm_example.mvp.Presenter
import com.diegosantos.mvp_mvvm_example.mvp.SamplePresenter
import com.diegosantos.mvp_mvvm_example.mvp.View
import com.diegosantos.mvp_mvvm_example.mvvm.SampleViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Mock lateinit var randomNumberRepository: RandomNumberRepository
    lateinit var sampleViewModel: SampleViewModel
    lateinit var presenter: SamplePresenter
    @Mock lateinit var view: View

    @Before
    fun setUpTest() {
        MockitoAnnotations.initMocks(this)
        sampleViewModel = SampleViewModel(randomNumberRepository)
        presenter = SamplePresenter(view, randomNumberRepository)
    }

    @Test
    fun setCorrectNumberViewModel() {
        Mockito.`when`(randomNumberRepository.getRandomNumber()).thenReturn(45)

        sampleViewModel.getRandomNumber()
        assertEquals("45", sampleViewModel.currentRandomNumber.get())

        Mockito.`when`(randomNumberRepository.getRandomNumber()).thenReturn(70)

        sampleViewModel.getRandomNumber()
        assertEquals("70", sampleViewModel.currentRandomNumber.get())
    }

    @Test
    fun setCorrectNumberPresenter() {
        Mockito.`when`(randomNumberRepository.getRandomNumber()).thenReturn(45)

        presenter.getRandomNumber()
        Mockito.verify(view).updateUI("45")

        Mockito.`when`(randomNumberRepository.getRandomNumber()).thenReturn(70)

        presenter.getRandomNumber()
        Mockito.verify(view).updateUI("70")
    }
}
