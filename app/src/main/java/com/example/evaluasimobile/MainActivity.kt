package com.example.evaluasimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Aplikasi Konversi"

        val btnkonversiRupiah: Button = findViewById(R.id.btn_dollar)
        btnkonversiRupiah.setOnClickListener(this)

        val btnkonversiSuhu: Button = findViewById(R.id.btn_suhu)
        btnkonversiSuhu.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_dollar -> {
                val rupiahIntent = Intent(this@MainActivity, dollar::class.java)
                startActivity(rupiahIntent)
            }
            R.id.btn_suhu -> {
                val suhuIntent = Intent(this@MainActivity, suhu::class.java)
                startActivity(suhuIntent)

            }
        }
    }
}
