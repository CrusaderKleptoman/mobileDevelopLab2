package Confectionery

enum class Confectionery {
    CAKE {
        override val price = 20.0f
        override fun printName(): String {
            return "Торт"
        }
    },
    SWEET {
        override val price = 5.0f
        override fun printName(): String {
            return "Конфета"
        }
    },
    CUPCACKE {
        override val price = 10.0f
        override fun printName(): String {
            return "Кекс"
        }
    };
    abstract fun printName(): String
    abstract val price: Float
}