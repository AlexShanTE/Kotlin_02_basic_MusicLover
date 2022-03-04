fun main() {

    val isMusicLover = true
    val additionDiscount = 0.01  // 1%

    val previousPurchase = 1000000
    val currentPurchase = 5000

    val finalPrice: Double = if (previousPurchase > 10_000) {
        currentPurchase * 0.95
    } else if (previousPurchase > 1000) {
        currentPurchase - 100.0
    } else {
        currentPurchase.toDouble()
    }

    if (isMusicLover) {
        val priceForMusicLover = finalPrice * (1 - additionDiscount)
        println("Цена товара для постоянного покупателя $priceForMusicLover рублей")
    } else {
        println("Цена товара для покупателя $finalPrice рублей")
    }
}