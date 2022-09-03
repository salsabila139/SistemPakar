package com.salsabila.idn.vaksinmoderna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salsabila.idn.vaksinmoderna.databinding.ActivityHasilBinding

class HasilActivity : AppCompatActivity() {

    lateinit var binding: ActivityHasilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKembali.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}