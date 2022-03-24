package io.github.tuguzt.viewmodellivedatapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.tuguzt.viewmodellivedatapractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object RandomNumber : SingletonHolder<RandomNumberViewModel>() {
        override val constructor = { RandomNumberViewModel() }
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        instance.currentNumber.observe(this) {
            binding.rndNum.text = it.toString()
        }

        binding.getRnd.setOnClickListener {
            instance.generate()
        }
    }
}
