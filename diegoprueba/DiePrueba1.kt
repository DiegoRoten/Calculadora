package DIEGO.diegoprueba

fun main() {
    val child = 5
    val adult = 27
    val senior = 87

    val isMonday = true


    println("El valor del ticket para una persona de $child años es  \$${ticketPrice(child, isMonday)}.")
    println("El valor del ticket para una persona de $adult años es  \$${ticketPrice(adult, isMonday)}.")
    println("El valor del ticket para una persona de $senior años es  \$${ticketPrice(senior, isMonday)}")

}
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 200
        in 13..60 -> if (isMonday) 500  else 750
        in 61..100 -> 250
        else -> -1
    }
}