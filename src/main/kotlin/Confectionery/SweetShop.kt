package Confectionery

class SweetShop {
    var employees:ArrayList<Employee> = arrayListOf()
    var orders:ArrayList<Order> = arrayListOf()

    fun executeOrder(id:Int)
    {
        var order:Order = orders.get(id)
        var number:Int = 0

        while (employees.get(number).specialization != order.sweet || number < orders.size) {number++}

        if (employees.get(number).specialization == order.sweet) {
            orders.removeAt(id)
            println("Заказ номер ${id+1} выполнен сотрудником ${employees.get(number).firstName}")
        }
    }

    fun addEmloyee(employee: Employee) { this.employees.add(employee)}

    fun removeEmployee(employee: Employee) {this.employees.remove(employee)}
    fun removeEmployee(id: Int) {this.employees.removeAt(id)}

    fun writeAllEmployees(){ for (employee in employees) println(employee.toString())   }
    fun writeAllOrders(){ for (order in orders) println(order.toString()) }
    fun writeOrder(order: Order){println(orders.indexOf(order))}

    fun addOrder(order: Order) {
        this.orders.add(order)
        executeOrder(this.orders.lastIndex)
    }
}