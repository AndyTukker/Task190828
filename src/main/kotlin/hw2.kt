fun main(){
    val bodyheight = 1.83
    val bodyMass = 70.500
    val index = bodyMassIndex(bodyheight,bodyMass)
    val verdict = when {
        (index<16) -> "Выраженный дефицит массы тела"
        (index<18.5) -> "Недостаточная (дефицит) масса тела"
        (index<25) -> "Норма"
        (index<30) -> "Избыточная масса тела (предожирение)"
        (index<35) -> "Ожирение"
        (index<40) -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)
}

fun bodyMassIndex(
    bodyheight: Double,
    bodyMass : Double
): Double {
    return bodyMass/bodyheight/bodyheight
}
