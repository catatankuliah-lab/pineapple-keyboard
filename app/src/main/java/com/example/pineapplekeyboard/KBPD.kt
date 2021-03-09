package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KBPD : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_b_p_d)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "KBParadise untuk varian KBParadise V60 Dolch hadir dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Dilengkapi dengan Tai-Hao ABS Double Shot Keycap ABS dan Detachable Mini-USB Cable membuat keyboard ini lebih mudah jika dibawa kemana-mana.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}