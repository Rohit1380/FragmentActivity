package com.example.fragmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var mainInterface:MainInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            mainInterface.Plus(1)
        }
        binding.btnMinus.setOnClickListener {
            mainInterface.Minus(1)
        }
    }
}