package org.example
fun main() {

    val electrodomestico1: Electrodomestic = Electrodomestic(preu_base = 35.0, color = "blanc", consum = "D", pes = 2)
    val electrodomestico2: Electrodomestic = Electrodomestic(preu_base = 100.0, color = "negre", consum = "C", pes = 8)

    val rentadora1: Rentadora = Rentadora(7,200.0, "negre","A",  7)
    val televisio1: Televisio = Televisio(42,500.0, "blanc","C",  15)
    val televisio2: Televisio = Televisio(50,200.0, "negre","D",  20)

    mostrar_informacion_electrodomestico("Electrodomèstic 1", electrodomestico1)
    mostrar_informacion_electrodomestico("Electrodomèstic 2", electrodomestico2)
    mostrar_informacion_electrodomestico("Rentadora 1", rentadora1)
    mostrar_informacion_electrodomestico("Televisió 1", televisio1)
    mostrar_informacion_electrodomestico("Televisió 2", televisio2)

    mostrar_totales_por_tipo(
        listOf(electrodomestico1, electrodomestico2, rentadora1, televisio1, televisio2)
    )

}
