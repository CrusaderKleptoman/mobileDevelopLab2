package Confectionery

class SweetShop {
    var employees:ArrayList<Employee> = arrayListOf()
    var orders:ArrayList<Order> = arrayListOf()

    fun executeOrder(id:Int)
    {
        var order:Order = orders.get(id)
        var number:Int = 0
        while (employees.get(number).specialization != order.sweet || number < orders.size) {number++}
        if (employees.get(number).specialization == order.sweet) {orders.removeAt(id)}
    }

    fun addEmloyee(employee: Employee) { this.employees.add(employee)}

    fun addOrder(order: Order) { this.orders.add(order)}
}