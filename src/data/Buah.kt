package data

class Buah(val harga:Int):Comparable<Buah>{
    override fun compareTo(other: Buah): Int {
        return this.harga.compareTo(other.harga)
    }

    override fun toString(): String = "Buah harga ${this.harga}"
}