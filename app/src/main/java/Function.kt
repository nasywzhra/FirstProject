fun main (){
   val name = "nasywa!"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    evening(name)
    evening(name)
    evening(name)
    night(name)
    morning(name)
    goodbye(name)
    goodbye(name)
}

fun morning(name : String){
    println("Halo selamat pagi ${name}!")
}
fun afternoon(name: String){
    println("Halo selamat siang ${name}!")
}
fun goodbye( name: String){
    println("Halo sampai jumpa ${name}!")
}
fun evening ( name:String){
    println("Halo selamat sore ${name} ")
}
fun night ( name: String){
    println("Halo selamat malam ${name}")
}