package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DuckyOne2 : AppCompatActivity(), View.OnClickListener{

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ducky_one2)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Ducky One 2 Mini RGB adalah keyboard layout 60% dari Ducky One yang hadir dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Ukuran 60% layout dan desain frame yang tipis membuat keyboard ini cocok untuk dibaawa kemana-mana.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}