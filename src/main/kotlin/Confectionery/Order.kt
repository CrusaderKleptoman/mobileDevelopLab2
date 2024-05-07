package Confectionery

data class Order(var amount:Int, var employee: Employee) {
    override fun toString(): String {
        return "Заказ: ${employee.specialization}, $amount"
    }
    fun executeOrder()
    {
        println("Заказ выполнен сотрудником ${employee.firstName}")
    }
}