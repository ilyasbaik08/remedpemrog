package remed

fun main() {
    //Buat contoh array min. 20 lalu print
    val binatang: Array<String> = arrayOf(
        "1.kucing",
        "2.siput",
        "3.anjing",
        "4.babi",
        "5.capung",
        "6.ayam",
        "7.marmut",
        "8.gajah",
        "9.ulat",
        "10.ketek",
        "11.ulo",
        "12.coro",
        "13.manuk",
        "14.kerbau",
        "15.belalang",
        "16.sapi",
        "16.unta",
        "17.harimau",
        "18.panda",
        "19.pinguin",
        "20.jangkrik",



    )
    binatang.forEachIndexed{index,binatang->
        println("$binatang")
    }

}