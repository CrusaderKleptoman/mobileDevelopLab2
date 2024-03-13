package Confectionery

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.absolutePathString

class SweetShopTest {

    @Test
    fun addEmloyee1() {
        var sweetShop:SweetShop = SweetShop()
        val testUser = Employee("John", "Worker", Confectionery.CAKE)
        sweetShop.addEmloyee(testUser)
        var textMainMenu:String = File("C:\\Users\\stud\\Downloads\\mobileDevelopLab2-master\\src\\main\\kotlin\\TextMessage\\TextMainMenu.txt").readText(Charsets.UTF_8)
        print(textMainMenu)
        assertEquals(testUser, sweetShop.employees.get(0))
    }
}