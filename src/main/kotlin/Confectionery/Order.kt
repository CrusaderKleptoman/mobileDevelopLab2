package Confectionery

data class Order(var amount:Int, var sweet:Confectionery) {
    override fun toString(): String {
        return "Заказ: $sweet $amount"
    }
}