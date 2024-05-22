package Confectionery

data class Order(var amount:Int, var employee: Employee) {
    override fun toString(): String {
        return "Заказ: ${employee.specialization}, $amount"
    }
    fun executeOrder()
    {
        var confectionery:Confectionery = employee.cook()
        println("${toString()}, выполнен сотрудником ${employee.firstName}")
        println("Стоимость заказа = ${confectionery.price*this.amount}")
    }
}