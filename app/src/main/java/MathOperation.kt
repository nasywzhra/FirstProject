fun main(){
    persegi(5.0)
    persegiPanjang(5.0 ,10.0)
    jajarGenjang(5.0 , 9.0)
    layangLayang(3.0 ,5.0 /2)
    trapesium(5.0 , 5.0 ,9.0)
    lingkaran(5.0 )
    segitiga(7.0 ,4.0 )
    belahKetupat(7.0 ,5.0)

}

fun persegiPanjang(panjang : Double,lebar : Double) {
    val result = panjang * lebar
    println("luas persegi panjang adalah $result")
}

fun persegi(sisi : Double) {
    val result = sisi * sisi
    print("luas persegi adalah $result")
}
fun jajarGenjang(alas : Double,tinggi : Double){
    val result = alas * tinggi
    print("luas jajar genjang adalah $result")

}
fun layangLayang(D1 : Double, D2 : Double){
    val result = D1 * D2/2
    print("luas layang layang adalah $result")
}
fun trapesium(a:Double, b:Double ,tinggi:Double){
    val result = a+b * tinggi /2
    print("luas trapesium adalah $result")
}
fun lingkaran(radius : Double){
    val result = radius * radius
    print("luas lingkaran adalah $result")
}
fun segitiga(a : Double,t : Double){
    val result = a * t /2
    print("luas segitiga adalah $result")
}
fun belahKetupat(diagonal1 : Double, diagonal2 : Double){
    val result = diagonal1 * diagonal2 /2
    print("luas belah ketupat adlah $result")
}