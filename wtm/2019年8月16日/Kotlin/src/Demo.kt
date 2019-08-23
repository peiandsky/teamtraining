//Kotlin 函数和变量的定义
class Greeter(val name: String) {
    fun max(a: Int, b: Int) {

        println("$name: 今年", (if (a > b) a else b), "岁")
    }

    private fun println(s: String, i: Int, s1: String) {
        println(s + i + s1)
    }
}

fun main(args: Array<String>) {    // 包级可见的函数，接受一个字符串数组作为参数
    Greeter("Whorld").max(10, 12)        // 分号可以省略

}

