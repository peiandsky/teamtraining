fun maxof(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//返回空值函数
fun parseInt(str: String): Int? {
    //如果不能转换成int类型就返回一个null值
    return str.toIntOrNull()
}

fun printproduct(arg0: String, arg1: String) {
    val x = parseInt(arg0)
    val y = parseInt(arg1)
    //if表达式
    if (x != null && y != null) {
        println(x * y)
    } else {
        println("x=$x      y=$y")
    }

}


fun main(args: Array<String>) {
    println("max of 0 and 42 is ${maxof(5, 6)}")
    printproduct("5", "6")
    printproduct("a", "b")
    printproduct("2", "b")
}