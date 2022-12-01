@file:Suppress("DEPRECATION")

package com.example.probanumerdwa

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val images = arrayOf(R.drawable.catz, R.drawable.catzie, R.drawable.cat)
        val image = findViewById<ImageView>(R.id.zdj1)
        findViewById<Button>(R.id.b1).setOnClickListener {
            when (image.drawable.constantState) {
                resources.getDrawable(images[0]).constantState -> {
                    image.setImageResource(images[2])
                }
                resources.getDrawable(images[1]).constantState -> {
                    image.setImageResource(images[0])
                }
                resources.getDrawable(images[2]).constantState -> {
                    image.setImageResource(images[1])
                }
            }
        }
        findViewById<Button>(R.id.b2).setOnClickListener {
            when (image.drawable.constantState) {
                resources.getDrawable(images[0]).constantState -> {
                    image.setImageResource(images[1])
                }
                resources.getDrawable(images[1]).constantState -> {
                    image.setImageResource(images[2])
                }
                resources.getDrawable(images[2]).constantState -> {
                    image.setImageResource(images[0])
                }
            }
        }
        findViewById<Button>(R.id.b3).setOnClickListener() {
            val uno = findViewById<EditText>(R.id.liczba1)
            val liczba = uno.text.toString().toInt()
            val wynik = liczba * 1 * 2 * 3
            val a = AlertDialog.Builder(this)
            a.setTitle("Wynik")
            a.setMessage("Silnia z liczby $liczba wynosi: $wynik")
            a.show()
        }
    }
    }