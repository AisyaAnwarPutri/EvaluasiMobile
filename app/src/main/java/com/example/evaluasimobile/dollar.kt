package com.example.evaluasimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class dollar : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dollar)
        supportActionBar?.title = "Aplikasi Konversi"

        edtNilai = findViewById(R.id.edt_dollar)
        btnCalculate = findViewById(R.id.btn_konversi)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    private lateinit var edtNilai: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_konversi) {
            val inputNilai = edtNilai.text.toString().trim()

            var isEmptyFields = false
            if (inputNilai.isEmpty()) {
                isEmptyFields = true
                edtNilai.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val konversi = inputNilai.toInt()/15000

                tvResult.text = ("Hasil Konversi $"+konversi.toString())

            }
        }
    }
}
