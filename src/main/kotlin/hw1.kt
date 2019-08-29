fun calculateFee(
    currentSale: Int,
    previousSale: Int = 0,
    isExclusive: Boolean = false
): Int {
    val fee = when {
        (previousSale > 50_000) -> 15
        (previousSale > 10_000) -> 20
        (previousSale > 1_000)  -> 25
        else     -> 30
    }
    return currentSale*(if (isExclusive) fee-5 else fee)/100
}

fun main(){
    println(calculateFee(200))
    println(calculateFee(200,2_000))
    println(calculateFee(200,20_000))
    println(calculateFee(200,200_000))
    println(calculateFee(200,200_000,true))
}