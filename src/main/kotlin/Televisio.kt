package org.example
class Televisio(
    var mida: Int = 28,
    preu_base: Double = 0.0,
    color: String = "blanc",
    consum: String = "G",
    pes: Int = 5
) : Electrodomestic(preu_base, color, consum, pes) {
    override fun preu_final(): Double {
        var preu_final = super.preu_final()

        when {
            mida in 29..32 -> preu_final += 50
            mida <= 42 -> preu_final += 100
            mida <= 50 -> preu_final += 150
            else -> preu_final += 200
        }

        return preu_final
    }
}