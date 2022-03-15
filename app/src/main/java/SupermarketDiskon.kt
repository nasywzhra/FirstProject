fun main(){
    val price = 400000

    if(price >= 400000 && price <= 800000) {
        val resultDiskon=400000 * 4/100
        val finalPrice = price - resultDiskon
        print ("total uang adalah $resultDiskon")
    }else if ( price >= 800000 && price <= 16000000){
        val resultDiskon=800000 * 9/100
        val finalPrice = price - resultDiskon
        print ("total uang adalah $resultDiskon")
    }else if ( price >= 16000000 && price <= 2000000){
        val resultDiskon=16000000 * 19/100
        val finalprice = price - resultDiskon
        print ("total uang adalah $resultDiskon")
    }else if ( price >= 2000000 && price <= 3000000){
        val resulDiskon=2000000 * 25/100
        val finalprice = price - resulDiskon
        print ("total uang adalah $resulDiskon")
    }else if ( price >= 3000000){
        val resultDiskon=3000000 * 40/1000
        val finalprice = price - resultDiskon
        print ("total uang adalah $resultDiskon")
    }

}