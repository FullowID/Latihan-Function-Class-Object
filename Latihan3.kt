fun main(){
    val barang = Barang()
    barang.tampil()
    barang.hitungTotal()
}

class Barang(var nama: String = "Kosong", var harga: Double = 0.0, var jumlah: Int = 0, var diskon: Int = 0){
    fun tampil(){
        println("""
            Nama: $nama
            Harga: $harga
            Jumlah: $jumlah
            Diskon: $diskon
        """)
    }

    fun hitungTotal() {
        val total= harga * jumlah * diskon
        println("Total = $total")
    }
}