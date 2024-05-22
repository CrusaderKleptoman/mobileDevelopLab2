package Confectionery

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


class SweetShopTest {

    @Test
    fun addEmloyee1() {
        var sweetShop:SweetShop = SweetShop()
        val testUser = EmployeeSweet("John", "Worker")
        sweetShop.addEmloyee(testUser)
        sweetShop.writeAllEmployees()
        assertEquals(testUser, sweetShop.employees.get(0))
    }

}