package Confectionery

data class Employee(var lastName:String, var firstName:String, var specialization:Confectionery) {
    override fun toString(): String {
        return "Сотрудник: $lastName $firstName, специализация = $specialization"
    }
}