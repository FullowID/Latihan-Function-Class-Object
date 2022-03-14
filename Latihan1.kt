fun main(){
    jarakKoordinat(2,3,8,7)
    jarakKoordinat(5,3,-8,-4)
}

fun jarakKoordinat (x1: Int, x2: Int, y1: Int, y2: Int){
    var hasil = Math.sqrt((Math.pow((x2-x1).toDouble(), 2.0) + Math.pow((y2-y1).toDouble(), 2.0)))
    var cetakHasil  = String.format("%.2f", hasil)
    println(cetakHasil)
}

