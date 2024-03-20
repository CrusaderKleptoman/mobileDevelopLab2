package Confectionery

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


class SweetShopTest {

    @Test
    fun addEmloyee1() {
        var sweetShop:SweetShop = SweetShop()
        val testUser = Employee("John", "Worker", Confectionery.CAKE)
        sweetShop.addEmloyee(testUser)
        sweetShop.writeEmployees()
        assertEquals(testUser, sweetShop.employees.get(0))
    }
}