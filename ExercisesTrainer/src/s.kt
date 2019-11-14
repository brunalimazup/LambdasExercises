//fun main(args: Array<String>) {
//    println(arg)
//
//
//    fun add(x: Int, y: Int) = x + y
//    fun partial(x: Int, y: (arg: Int) -> Unit) {
//        y(x)
//
//        fun arg(x: Int, y: Int) = x * y
//        val times5 = partial(5, ::arg)
//        val result = times5(3)
//    }
//
//}

class Exercise() {

    fun partial (value: Int,add: (Int, Int) -> Int) {

    }

    fun times (x: Int, y: Int) = x * y
    val times5 = partial (5, ::times)
    val result = times5(3) //15
}

private operator fun Unit.invoke(i: Int): Any = Unit

