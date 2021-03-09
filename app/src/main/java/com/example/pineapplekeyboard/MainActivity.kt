package com.example.pineapplekeyboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvKeyboard: RecyclerView
    private var list: ArrayList<Keyboard> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKeyboard = findViewById(R.id.recycleview_keyboard)
        rvKeyboard.setHasFixedSize(true)

        list.addAll(KeyboardData.listData)
        showRecyclerList()

    }

    private fun changeActivity (keyboard: Keyboard) {
        if (keyboard.name == "Vortex RACE 3 RGB") {
            val moveIntent = Intent(this@MainActivity,VortexRace3::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "The Magicforce Smart 82") {
            val moveIntent = Intent(this@MainActivity,Magiforce82::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "Magicforce Smart 68 Typewriter") {
            val moveIntent = Intent(this@MainActivity,Magiforce68::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "Ducky One 2 Mini RGB") {
            val moveIntent = Intent(this@MainActivity,DuckyOne2::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "Ducky x Varmilo MIYA Pro Sakura") {
            val moveIntent = Intent(this@MainActivity,DuckyVarmilo::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "KBParadise V60 Vintage Beige Top Print") {
            val moveIntent = Intent(this@MainActivity,KBPV::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "KBParadise V60 Dolch (Cherry MX Blue)") {
            val moveIntent = Intent(this@MainActivity,KBPD::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "KBParadise V80 Red Dolch (Matias Quiet Click)"){
            val moveIntent = Intent(this@MainActivity,KBPR::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "Varmilo VA87M Vintage Days"){
            val moveIntent = Intent(this@MainActivity,Varmilo::class.java)
            startActivity(moveIntent)
        }

        if (keyboard.name == "The Vortexgear POK3R Limited Edition"){
            val moveIntent = Intent(this@MainActivity,Pok3r::class.java)
            startActivity(moveIntent)
        }
    }

    private fun showRecyclerList() {
        rvKeyboard.layoutManager = LinearLayoutManager(this)
        val listKeyboardAdapter = ListKeyboardAdapter(list)
        rvKeyboard.adapter = listKeyboardAdapter

        listKeyboardAdapter.setOnItemClickCallback(object : ListKeyboardAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Keyboard) {
                changeActivity(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }
//
    fun onComposeAction(mi: MenuItem?) {
        if (mi != null) {
            if (mi.itemId == R.id.miProfile){
                val moveIntent = Intent(this@MainActivity,ProfilActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}