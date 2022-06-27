package com.example.homework5

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homework5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var car: Cars
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClick();
        initTosts();
        initIntent();
    }

    private fun initTosts() {
        binding.btnIsBmw.setOnClickListener {
            if (car == Cars.BMW) {
                Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Не верно", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnIsMers.setOnClickListener {
            if (car == Cars.MERS) {
                Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Не верно", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnIsRollse.setOnClickListener {
            if (car == Cars.ROLLSE) {
                Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Не верно", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun initClick() {
        binding.btnBmw.setOnClickListener {
            binding.carImg.setImageResource(R.drawable.bmw)
            car = Cars.BMW

        }

        binding.btnMers.setOnClickListener {
            binding.carImg.setImageResource(R.drawable.mers)
            car = Cars.MERS
        }

        binding.btnRollse.setOnClickListener {
            binding.carImg.setImageResource(R.drawable.rollse)
            car = Cars.ROLLSE
        }
    }

    private fun initIntent() {
        binding.next.setOnClickListener {
            val intent = Intent(this@MainActivity, CarActivity::class.java)
            when(car){
                Cars.ROLLSE -> name = "Rollse"
                Cars.MERS -> name = "Mers"
                Cars.BMW -> name = "Bmw"
            }
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}