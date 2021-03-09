package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Magiforce82 : AppCompatActivity(), View.OnClickListener{

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magiforce82)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "The Magicforce Smart 82 menggunakan gateron mechanical switches, gateron switch sendiri sudah sangat terkenal di komunitas keyboard mechanic karena harganya yang relatif lebih murah tetapi memberikan pengalaman mengetik yang mewah. Magicforce Smart 82 datang dengan  ABS double shot backlit keycaps dan tetntunya dengan dukungan RGN backlight yang customable.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}