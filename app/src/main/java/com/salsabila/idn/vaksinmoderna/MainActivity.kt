package com.salsabila.idn.vaksinmoderna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salsabila.idn.vaksinmoderna.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView7.setOnClickListener {
            val intent = Intent(this, EfekSampingActivity::class.java)
            startActivity(intent)
        }

        binding.imageView6.setOnClickListener {
            val intent = Intent(this, DataEfekSampingActivity::class.java)
            startActivity(intent)
        }
    }
}