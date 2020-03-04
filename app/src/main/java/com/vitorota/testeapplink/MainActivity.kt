package com.vitorota.testeapplink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vitorota.testeapplink.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent?.data
        val action = intent?.action

        binding.textView.text = "Action: \n$action\n\n\nData:\n$data"
    }
}
