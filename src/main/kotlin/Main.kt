import Confectionery.Confectionery
import Confectionery.Order
import java.io.File
import java.util.Scanner

fun main(args: Array<String>) {
    menu()
}
var scanner:Scanner = Scanner(System.`in`)
var textMainMenu:String = File("src/main/kotlin/TextMessage/TextMainMenu.txt").readText(Charsets.UTF_8)

fun menu()
{
    var inputCode = 0
    while (true)
        println(textMainMenu)
        when(inputCode){
            1 ->{
                var newOrder: Order
                println("Введите тип кондитерского изделия")

            }
            2 -> {

            }
            3 -> {

            }
            0 -> return
        }
}