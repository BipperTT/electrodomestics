package org.example
open class Electrodomestic(
    var preu_base: Double = 0.0,
    var color: String = "blanc",
    var consum: String = "G",
    var pes: Int = 5
) {
    open fun preu_final(): Double {
        var preu_final = preu_base

        // Incremento del precio según el consumo
        when (consum) {
            "A" -> preu_final += 35
            "B" -> preu_final += 30
            "C" -> preu_final += 25
            "D" -> preu_final += 20
            "E" -> preu_final += 15
            "F" -> preu_final += 10
            // G, no increment
        }

        // Incremento del precio según el peso
        when {
            pes in 6..20 -> preu_final += 20
            pes <= 50 -> preu_final += 50
            pes <= 80 -> preu_final += 80
            else -> preu_final += 100
        }

        return preu_final
    }
}
