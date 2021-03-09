package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KBPR : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_b_p_r)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "KBParadise V80 Red Dolch (Matias Quiet Click) merupakan varian dari seri KBParadise, kali ini hadir dengan switch Matias Quiet Click yang karakteristiknya sielnt membuat keyboard ini cocok juga digunakan di office. Dari segi keycaps yang digunakan hadir dengan Tai-Hao ABS Double Shot Keycap dengan dua buah kombinasi warna membuat keyboard ini sielnt tetapi juga cantik.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}