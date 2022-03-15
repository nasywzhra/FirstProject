import java.util.*

fun main(){
    val reader = Scanner( System.`in`)
    print("masukkan bilangan pertama  :  ")
    val bil1 = reader.nextInt()
    println("masukkan bilangan kedua   :  ")
    val bil2 = reader.nextInt()
    calculator2Bil(5 ,8)

}
fun calculator2Bil(bil1: Int, bil2: Int){
    val penjumlahan = bil1 + bil2
    val perkalian = bil1 * bil2
    val pengurangan = bil2 - bil1
    val pembagian = bil2 / bil1


    println("operasi matematika antar $bil1 dan $bil2 sebagai berikut \npenjumlahan $penjumlahan \nperkalian $perkalian \npengurangan $pengurangan \npembagian $pembagian")
}