package org.example
fun mostrar_informacion_electrodomestico(nombre: String, electrodomestico: Electrodomestic) {
    println("$nombre:")
    println("Preu base: ${electrodomestico.preu_base}€")
    println("Color: ${electrodomestico.color}")
    println("Consum: ${electrodomestico.consum}")
    println("Pes: ${electrodomestico.pes}kg")
    println("Preu final: ${electrodomestico.preu_final()}€")
    println()
}

fun mostrar_totales_por_tipo(electrodomesticos: List<Any>) {
    val preu_base_total = electrodomesticos.filterIsInstance<Electrodomestic>().sumByDouble { it.preu_base }
    val preu_final_total = electrodomesticos.filterIsInstance<Electrodomestic>().sumByDouble { it.preu_final() }

    println("Totals per tipus d'electrodomèstic:")
    println("Preu base total: $preu_base_total€")
    println("Preu final total: $preu_final_total€")
    println()
}
