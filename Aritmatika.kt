package remed

fun main() {
    //Buat rumus untuk menghitung aritmatka menggunakan range
    val a = 3..39 step 4
    val suku = 0
    a.forEachIndexed{ Index, angka ->
        println(" Suku ${Index + 1} Adalah $angka")
    }
}