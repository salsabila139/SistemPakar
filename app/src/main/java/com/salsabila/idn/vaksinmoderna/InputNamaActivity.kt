package com.salsabila.idn.vaksinmoderna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salsabila.idn.vaksinmoderna.databinding.ActivityInputNamaBinding

class InputNamaActivity : AppCompatActivity() {

    lateinit var binding: ActivityInputNamaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputNamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, SkriningActivity::class.java)
            startActivity(intent)
        }
    }
}