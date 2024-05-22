package Confectionery

abstract class Employee(var lastName:String, var firstName:String ) {
    override fun toString(): String {
        return "Сотрудник: $lastName $firstName"
    }
    abstract val specialization:Confectionery
    abstract fun cook():Confectionery
}

class EmployeeSweet(lastName:String,firstName:String): Employee(lastName, firstName)
{
    override val specialization: Confectionery = Confectionery.SWEET
    override fun cook():Confectionery {
        println("Изготовлена конфета")
        return specialization
    }
}

class EmployeeCake(lastName:String,firstName:String): Employee(lastName, firstName)
{
    override val specialization: Confectionery = Confectionery.CAKE
    override fun cook():Confectionery  {
        println("Изготовлен торт")
        return specialization
    }
}

class EmployeeCupcake(lastName:String,firstName:String): Employee(lastName, firstName)
{
    override val specialization: Confectionery = Confectionery.CUPCACKE
    override fun cook():Confectionery  {
        println("Изготовлен кекс")
        return specialization
    }
}