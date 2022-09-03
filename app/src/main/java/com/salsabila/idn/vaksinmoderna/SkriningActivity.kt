package com.salsabila.idn.vaksinmoderna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salsabila.idn.vaksinmoderna.databinding.ActivitySkriningBinding

class SkriningActivity : AppCompatActivity() {

    lateinit var binding: ActivitySkriningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkriningBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProses.setOnClickListener {
            val intent = Intent(this, HasilActivity::class.java)
            startActivity(intent)
        }
    }

}