package com.salsabila.idn.vaksinmoderna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salsabila.idn.vaksinmoderna.databinding.ActivityInformasiBinding

class InformasiActivity : AppCompatActivity() {

    lateinit var binding: ActivityInformasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}