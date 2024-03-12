package Confectionery

class Employee {
    var lastName:String? = null
        set(lastName){ field = lastName}
        get() = this.lastName
    var firstName:String? = null
        set(firstName){ field = firstName}
        get() = this.firstName
    var specialization:Confectionery? = null
        set(specialization){ field = specialization}
        get() = this.specialization
}