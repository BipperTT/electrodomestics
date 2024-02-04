package org.example

fun mostrar_informacion_electrodomestico(nombre: String, electrodomestico: Electrodomestic) {
    println("${WHITE_BOLD_BRIGHT}$nombre:${RESET}")
    println("${WHITE}Preu base: ${electrodomestico.preu_base}€${RESET}")
    println("${WHITE}Color: ${electrodomestico.color}${RESET}")
    println("${WHITE}Consum: ${electrodomestico.consum}${RESET}")
    println("${WHITE}Pes: ${electrodomestico.pes}kg${RESET}")
    println("${WHITE}Preu final: ${electrodomestico.preu_final()}€${RESET}")
    println()
}

fun mostrar_totales_por_tipo(electrodomesticos: List<Any>) {
    val preu_base_total = electrodomesticos.filterIsInstance<Electrodomestic>().sumByDouble { it.preu_base }
    val preu_final_total = electrodomesticos.filterIsInstance<Electrodomestic>().sumByDouble { it.preu_final() }

    println("${WHITE_BOLD_BRIGHT}Totals per tipus d'electrodomèstic:${RESET}")
    println("${WHITE}Preu base total: $preu_base_total€${RESET}")
    println("${WHITE}Preu final total: $preu_final_total€${RESET}")
    println()
}
