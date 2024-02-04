package org.example
class Rentadora(
    var c_arrega: Int = 5,
    preu_base: Double = 0.0,
    color: String = "blanc",
    consum: String = "G",
    pes: Int = 5
) : Electrodomestic(preu_base, color, consum, pes) {
    override fun preu_final(): Double {
        var preu_final = super.preu_final()

        when (c_arrega) {
            6, 7 -> preu_final += 55
            8 -> preu_final += 70
            9 -> preu_final += 85
            10 -> preu_final += 100
        }

        return preu_final
    }
}