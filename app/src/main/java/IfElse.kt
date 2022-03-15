import java.util.*

fun main(){
    val reader = Scanner( System.`in`)
    print("masukkan bilangan tersebut")
    val number = reader.nextInt()
    if (number < 0) {
        print("Negative")
    }else{
        print("Positive")
    }
}
