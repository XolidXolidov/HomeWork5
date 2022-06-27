package com.example.homework5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework5.databinding.ActivitySecondBinding

class CarActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    lateinit var name: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        binding.tvAnswer.text = name
    }
}