package remed

fun main() {
    //print
    //  "Saya lapar sekali, minjem 100 dong buat makan hari ini" 600 kali
    // GUNAKAN RANGE
    val a = 1..600
    val makan = 0
    a.forEachIndexed{index,makan->
        println("saya lapar sekali, minjem 100 ding buat makan hari ini")
    }
}