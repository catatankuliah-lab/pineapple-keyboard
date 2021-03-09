package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Magiforce68 : AppCompatActivity(), View.OnClickListener{

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magiforce68)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Magicforce Smart 68 Typewriter hadir dengan gateron mechanical switches, gateron switch sendiri sudah sangat terkenal di komunitas keyboard mechanic karena harganya yang relatif lebih murah tetapi memberikan pengalaman mengetik yang mewah. Yang menjadikan keyboard ini unik karena bentuk keycapsnya yang cenderung membuat pengalaman mengetik yang berbeda dengan keyboard lainnya serta dukungan RGB backlight yang membuat keyboard ini terlihat lebih cantik.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}