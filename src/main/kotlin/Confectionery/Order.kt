package Confectionery

class Order() {
    var amount:Int? = null
        set(amount) { field=amount}
        get() = this.amount
    var sweet:Confectionery? = null
        set(sweet) { field=sweet}
        get() = this.sweet
}