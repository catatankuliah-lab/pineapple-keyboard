package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class VortexRace3 : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vortex_race3)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Vortex RACE 3  menggunakan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan  50 million keystrokes, dibuat dengan case Alumunium dan DSA PBT Dye Sublimated Keycap yang menjadikan keycaps terasa nyaman ditangan, serta dukungan RGB backlight yang membuat keyboard ini terasa lebih mewah.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}