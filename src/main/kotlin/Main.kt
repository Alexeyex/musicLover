import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val buyPrice = sc.nextInt()
    if (buyPrice <= 1000) {
        print("Скидка не предоставляется")
    } else if (buyPrice in 1001..10000) {
        print("Вам предоставляется скидка 100 рублей. Ваша цена составит ${buyPrice-100}")
    } else if (buyPrice>=10001) {
        print("Вам предоставляется скидка 5%. Ваша цена составит ${buyPrice - buyPrice*0.05}")
    }
}