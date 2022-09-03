package com.salsabila.idn.vaksinmoderna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import com.salsabila.idn.vaksinmoderna.databinding.ActivityEfekSampingBinding

class EfekSampingActivity : AppCompatActivity() {

    lateinit var binding: ActivityEfekSampingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEfekSampingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        binding.btnNext.setOnClickListener {
            val intent = Intent(this, InputNamaActivity::class.java)
            startActivity(intent)
        }
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

        }
    }

}