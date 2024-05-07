package Confectionery

class SweetShop {
    var employees:ArrayList<Employee> = arrayListOf()
    var orders:ArrayList<Order> = arrayListOf()

    fun executeOrder(id:Int)
    {
        orders.get(id).executeOrder()
        orders.removeAt(id)
    }

    fun addEmloyee(employee: Employee) { this.employees.add(employee)}

    fun removeEmployee(employee: Employee) {this.employees.remove(employee)}
    fun removeEmployee(id: Int) {this.employees.removeAt(id)}

    fun writeAllEmployees(){ for (employee in employees) println(employee.toString())   }
    fun writeAllOrders(){ for (order in orders) println(order.toString()) }
    fun writeOrderIndex(order: Order){println(orders.indexOf(order))}

    fun addOrder(amount:Int, specialization:Confectionery) {
        employees.forEach {
            if (it.specialization == specialization)
            {
                this.orders.add(Order(amount, it))
                println("Заказ принят")
            }
            else
            {
                println("Заказ не был принят, отсутствует необходимый специалист")
            }
        }
    }
}