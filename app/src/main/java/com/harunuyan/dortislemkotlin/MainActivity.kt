package com.harunuyan.dortislemkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayi1: Double? = null
    var sayi2: Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Hatalı giriş"
        } else {
            textView.text = "Sonuç : ${sayi1!! + sayi2!!}"
        }
    }

    fun cikar(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Hatalı giriş"
        } else {
            textView.text = "Sonuç : ${sayi1!! - sayi2!!}"
        }
    }

    fun bol(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Hatalı giriş"
        } else {
            textView.text = "Sonuç : ${sayi1!! / sayi2!!}"
        }
    }

    fun carp(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = "Hatalı giriş"
        } else {
            textView.text = "Sonuç : ${sayi1!! * sayi2!!}"
        }
    }
}