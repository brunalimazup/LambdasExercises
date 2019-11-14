fun main(arg: Array<String>) {

    /** Passando dois parâmetros**/
//    fun times (x: Int, y: Int) = x * y
//    val times5 = partial (7, ::times)
//    val result = times5(3)
//    println(result)
//}
//
//fun partial (value: Int,add: (Int, Int) -> Int): (Int) -> Int {
//    return {
//        add(value, it)
//    }
//}

    /** Passando Três parâmetros**/

//    fun phrase(firstLine: String, secondLine: String, thirdLine: String) = "$firstLine $secondLine $thirdLine"
//
//    val join = partial ("Hi, ", "my name is Laura.", ::phrase)
//    val result = join("I am nineteen years old.")
//    println(result)
//
//}
//    fun partial(x: String, y: String, z: (String, String, String) -> String): (String) -> String {
//        return {
//            z(x, y, it)
//        }
//    }

/** Exercício feito com o Danilo **/
//    fun add(x: Int, y: Int) = x + y
//    val addTo5 = partial(5, ::add)
//    val result = addTo5(3) //8
//    println(result)
//
//}
//
//fun partial(value: Int, functional: (Int, Int) -> Int): (Int) -> Int {
//    return {
//        functional(value, it)
//    }
//}