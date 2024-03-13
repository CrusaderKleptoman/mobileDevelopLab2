import Confectionery.Order
import java.io.File
import java.util.Scanner

fun main(args: Array<String>) {
}
var scanner:Scanner = Scanner(System.`in`)
var textMainMenu:String = File("/TextMessage/TextMainMenu.txt").readText(Charsets.UTF_8)
fun menu()
{
    var inputCode = 0
    while (true)
        println(textMainMenu)
        when(inputCode){
            1 ->print("1")
            2 ->print("2")
            3 ->print("3")
        }
}