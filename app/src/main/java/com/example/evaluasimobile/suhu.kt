package com.example.evaluasimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class suhu : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suhu)
        supportActionBar?.title = "Aplikasi Konversi"

        edtCelcius = findViewById(R.id.edt_celcius)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvFahrenheit = findViewById(R.id.tv_fahrenheit)
        tvReamur = findViewById(R.id.tv_reamur)
        tvKelvin = findViewById(R.id.tv_kelvin)

        btnCalculate.setOnClickListener(this)
    }
    private lateinit var edtCelcius: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvFahrenheit: TextView
    private lateinit var tvReamur: TextView
    private lateinit var tvKelvin: TextView

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate){
            val inputCelcius = edtCelcius.text.toString().trim()

            var isEmptyFields = false
            if (inputCelcius.isEmpty()) {
                isEmptyFields = true
                edtCelcius.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val fahrenheit = (9 * inputCelcius.toDouble() / 5) + 32
                val reamur = 4 * inputCelcius.toDouble() / 5
                val kelvin = inputCelcius.toDouble() + 273

                tvFahrenheit.text = ("Hasil Konversi Fahrenheit: "+fahrenheit.toString())
                tvReamur.text = ("Hasil Konversi Reamur: "+reamur.toString())
                tvKelvin.text = ("Hasil Konversi Kelvin: "+kelvin.toString())

            }
        }
    }

}