package io.github.tuguzt.viewmodellivedatapractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel : ViewModel() {
    private val _currentNumber by lazy { MutableLiveData<UInt>() }
    val currentNumber: LiveData<UInt> get() = _currentNumber

    @Suppress("MemberVisibilityCanBePrivate")
    val range by lazy { 0u until 50u }

    fun generate() {
        _currentNumber.value = range.random()
    }
}
