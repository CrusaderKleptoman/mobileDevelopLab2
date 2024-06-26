import Confectionery.Confectionery
import Confectionery.Order
import Confectionery.SweetShop
import java.io.File
import java.util.Scanner

fun main(args: Array<String>) {
    menu()
}
var scanner:Scanner = Scanner(System.`in`)
var textMainMenu:String = File("src/main/kotlin/TextMessage/TextMainMenu.txt").readText(Charsets.UTF_8)

fun menu()
{
    var inputCode = "0"
    var sweetShop: SweetShop = SweetShop()
    while (true) {
        println(textMainMenu)
        inputCode = scanner.next()
        when (inputCode) {
            "1" -> {
                var textInputSweet: String =
                    File("src/main/kotlin/TextMessage/TextInputSweet.txt").readText(Charsets.UTF_8)
                println(textInputSweet)
                inputCode = scanner.next()
                println("Введите количество кондитерского изделия")
                var inputAmount: Int = scanner.nextInt()
                when (inputCode) {
                    "1" -> {
                        sweetShop.addOrder(inputAmount, Confectionery.CAKE)
                    }

                    "2" -> {
                        sweetShop.addOrder(inputAmount, Confectionery.SWEET)
                    }

                    "3" -> {
                        sweetShop.addOrder(inputAmount, Confectionery.CUPCACKE)
                    }
                }

            }

            "2" -> {
                var orderId: Int = scanner.nextInt()
                sweetShop.executeOrder(orderId)

            }

            "3" -> {
                sweetShop.writeAllOrders()
            }

            "0" -> return
            else -> println("Некоректная команда, повторите ввод")
        }
    }
}