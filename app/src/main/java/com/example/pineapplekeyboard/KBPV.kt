package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class KBPV : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonShare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_b_p_v)

        buttonShare = findViewById(R.id.button_share)

        buttonShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "KBParadise V60 Vintage Beige hadir dengan menggunakan Xiang Min (XM) KSB Series ALPS Switches, karakteristik switch ini clicky switch dengan ivory slider. Dilengkapi dengan Detachable Mini-USB Cable membuat keyboard ini lebih mudah jika dibawa kemana-mana.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }
    }
}