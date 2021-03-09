package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DuckyVarmilo : AppCompatActivity(), View.OnClickListener{

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ducky_varmilo)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Ducky x Varmilo MIYA Pro Sakura, keyboard cantik hasil kolaborasi Ducky x Varmilo hadir dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Keycaps PBT yang digunakan hadir dengan \"Step-Sculpture 2\" low-profile keycaps, keycaps jenis ini membuat pengalmaan mengetik lebih nyaman.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}