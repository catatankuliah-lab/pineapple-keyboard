package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Pok3r : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pok3r)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "The Vortexgear POK3R Limited Edition datang dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Dilengkapi dengan Alumunium dan acrylic yang menjadikan keyboard ini ringan namun tetap solid. Pada bagian keycaps keyboard ini hadir dengan PBT double shot keycaps dan dukungan RGB backlight.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}