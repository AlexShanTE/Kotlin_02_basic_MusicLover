fun main() {

    val isMusicLover = false

    val standartDiscount = 100 // руб
    val middleDiscount = 0.05  // 5%
    val additionDiscount = 0.01  // 1%
    val finalDiscountValue: Double
    val finalDiscountPercentage: Double

    val previousPurchase = 1000000
    val currentPurchase = 5000

    var finalPrice: Double = if (previousPurchase in 0..1000) {
        currentPurchase.toDouble()
    } else if (previousPurchase in 1001..10_000) {
        (currentPurchase - standartDiscount).toDouble()
    } else {
        (currentPurchase - currentPurchase * middleDiscount)
    }

    if (isMusicLover)
        finalPrice *= (1 - additionDiscount)

    finalDiscountValue = currentPurchase - finalPrice
    finalDiscountPercentage = 100 - finalPrice / currentPurchase * 100

    println("Суммарная скидка составляет $finalDiscountPercentage %")
    println("Экономия: $finalDiscountValue рублей")
    println("Цена товара для покупателя $finalPrice рублей")

}