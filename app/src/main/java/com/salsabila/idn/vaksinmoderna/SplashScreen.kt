package com.salsabila.idn.vaksinmoderna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.salsabila.idn.vaksinmoderna.databinding.SplashScreenBinding

class SplashScreen : AppCompatActivity() {

    lateinit var Binding: SplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(Binding.root)
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()) //buat ngambil waktu
            .postDelayed({
                startActivity(Intent(this,MainActivity::class.java))
                finish() //buat matiin activity
            }, SPLASH_TIME_OUT)
    }
    companion object{
        private const val SPLASH_TIME_OUT = 1500L // i,5 detik
    }
}