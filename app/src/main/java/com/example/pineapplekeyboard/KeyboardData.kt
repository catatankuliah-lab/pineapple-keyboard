package com.example.pineapplekeyboard

object KeyboardData {
    private val keyboardNames = arrayOf(
        "Vortex RACE 3 RGB",
        "The Magicforce Smart 82",
        "Magicforce Smart 68 Typewriter",
        "Ducky One 2 Mini RGB",
        "Ducky x Varmilo MIYA Pro Sakura",
        "KBParadise V60 Vintage Beige Top Print",
        "KBParadise V60 Dolch (Cherry MX Blue)",
        "KBParadise V80 Red Dolch (Matias Quiet Click)",
        "Varmilo VA87M Vintage Days",
        "The Vortexgear POK3R Limited Edition")

    private val keyboardDetails = arrayOf(
            "Vortex RACE 3  menggunakan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan  50 million keystrokes, dibuat dengan case Alumunium dan DSA PBT Dye Sublimated Keycap yang menjadikan keycaps terasa nyaman ditangan, serta dukungan RGB backlight yang membuat keyboard ini terasa lebih mewah.",
            "The Magicforce Smart 82 menggunakan gateron mechanical switches, gateron switch sendiri sudah sangat terkenal di komunitas keyboard mechanic karena harganya yang relatif lebih murah tetapi memberikan pengalaman mengetik yang mewah. Magicforce Smart 82 datang dengan  ABS double shot backlit keycaps dan tetntunya dengan dukungan RGN backlight yang customable.",
            "Magicforce Smart 68 Typewriter hadir dengan gateron mechanical switches, gateron switch sendiri sudah sangat terkenal di komunitas keyboard mechanic karena harganya yang relatif lebih murah tetapi memberikan pengalaman mengetik yang mewah. Yang menjadikan keyboard ini unik karena bentuk keycapsnya yang cenderung membuat pengalaman mengetik yang berbeda dengan keyboard lainnya serta dukungan RGB backlight yang membuat keyboard ini terlihat lebih cantik.",
            "Ducky One 2 Mini RGB adalah keyboard layout 60% dari Ducky One yang hadir dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Ukuran 60% layout dan desain frame yang tipis membuat keyboard ini cocok untuk dibaawa kemana-mana.",
            "Ducky x Varmilo MIYA Pro Sakura, keyboard cantik hasil kolaborasi Ducky x Varmilo hadir dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Keycaps PBT yang digunakan hadir dengan \"Step-Sculpture 2\" low-profile keycaps, keycaps jenis ini membuat pengalmaan mengetik lebih nyaman.",
            "KBParadise V60 Vintage Beige hadir dengan menggunakan Xiang Min (XM) KSB Series ALPS Switches, karakteristik switch ini clicky switch dengan ivory slider. Dilengkapi dengan Detachable Mini-USB Cable membuat keyboard ini lebih mudah jika dibawa kemana-mana.",
            "KBParadise untuk varian KBParadise V60 Dolch hadir dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Dilengkapi dengan Tai-Hao ABS Double Shot Keycap ABS dan Detachable Mini-USB Cable membuat keyboard ini lebih mudah jika dibawa kemana-mana.",
            "KBParadise V80 Red Dolch (Matias Quiet Click) merupakan varian dari seri KBParadise, kali ini hadir dengan switch Matias Quiet Click yang karakteristiknya sielnt membuat keyboard ini cocok juga digunakan di office. Dari segi keycaps yang digunakan hadir dengan Tai-Hao ABS Double Shot Keycap dengan dua buah kombinasi warna membuat keyboard ini sielnt tetapi juga cantik.",
            "Varmilo VA87M Vintage Days + CMYK hadir dengan konfigurasi keycaps yang cantik dengan warna CMYK pada beberapa keycaps membuat keyboard ini semakin cantik. Untuk segi switch, keyboard ini hadir dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Untuk segi keycaps sendiri juga hadir dengan Keycaps PBT dengan teknologi \"Step-Sculpture 2\" low-profile keycaps, keycaps jenis ini membuat pengalmaan mengetik lebih nyaman.",
            "The Vortexgear POK3R Limited Edition datang dengan CHERRY MX Mechanical Switches yang memberikan garansi sampai dengan 50 Million Keystrokes yang membuat keyboard ini cukup meumpuni untuk game intens dan mengektik. Dilengkapi dengan Alumunium dan acrylic yang menjadikan keyboard ini ringan namun tetap solid. Pada bagian keycaps keyboard ini hadir dengan PBT double shot keycaps dan dukungan RGB backlight.")

    private val keyboardImages = intArrayOf(
            R.drawable.vortekrace3,
            R.drawable.magiforce82,
            R.drawable.magiforce68,
            R.drawable.duckyone2,
            R.drawable.duckyxvarmilo,
            R.drawable.kbparadise,
            R.drawable.kbparadisedolch,
            R.drawable.kbparadisered,
            R.drawable.varmilo,
            R.drawable.vortekpoker)

    val listData: ArrayList<Keyboard>
        get() {
            val list = arrayListOf<Keyboard>()
            for (position in keyboardNames.indices) {
                val keyboard = Keyboard()
                keyboard.name = keyboardNames[position]
                keyboard.detail = keyboardDetails[position]
                keyboard.photo = keyboardImages[position]
                list.add(keyboard)
            }
            return list
        }
}