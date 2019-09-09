package net.println.Demo

val sum = fun(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}
//如果是使用了lamdba表达式后
val sum1 = { arg1: Int, arg2: Int -> arg1 + arg2 }
//练习
val sum2 = { arg1: Int, arg2: Int -> arg1 + arg2 }
val sum3 = { arg1: Int, arg2: Int -> arg1 + arg2 }
val sum4 = { arg1: Int, arg2: Int -> arg1 + arg2 }
fun arrays() {
    val array = arrayOf(6, 2, 4, 3, 4, 8, 95, 5, 9)
    //数组的遍历
    for (i in array) {
        println(i)
    }
    array.forEach { print(it) }
    println()
    //使用lamdba表达
    array.forEach(::print)
}

fun main() {
    arrays()
        println()
    arraysDemo()
        println()
    forDemo()
        println()
    whenDemo()
        println()
    forDemo01()
        println()
    isNotNull()
        println()

    "str".spcaceToCamelCase()
    arrofmin(2)
        println()
    runDemo()
        println()
    applyDemo()
        println()
    letDemo()
}

fun arraysDemo() {
    val array: Array<Int> = arrayOf(10, 9, 3, 4, 5, 6, 7, 8, 2, 1)
    for (i in array) {
        println("$i  ${i.dec()} ${i.inc()} ${i.inv()}  ${i.unaryMinus()}  ${i.unaryPlus()}")
    }
    println()
    array.indices.forEach(::print)
    println()
    println(array.indices.last)
    var index = 0
    while (index < array.size) {
        if (index == array.indices.last) print("${array[index]}")
        else print("${array[index]},")
        index++
    }
}

fun forDemo() {
    val array = arrayOf(0, 11, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in array) {
        print(i)
    }
    println()
    //step 表示每次递增值
    for (i in 10..50 step 3) {
        print(i)
    }
    println()
    //downTo 递减   step 表示每次递减值
    for (i in 50 downTo 0 step 3) {
        print(i)
    }
    println()
    for (index in array.indices) {
        if (index == array.size - 1) print("${array[index]}")
        else print("${array[index]},")
    }
    println()
    //i是对应的索引值  item是索引对应的值
    for ((i, item) in array.withIndex()) {
        if (i == array.size - 1) print("$item")
        else print("$item,")
//        println("$i    $item")
    }
}

fun forDemo01() {
    val index = 1..20
    index.forEach here@{
        if (it == 3) return@here
        println(it)
    }
    houter@ for (j in 1..10) {
        for (i in index) {
            if (i == 5) break@houter
            print(i)
        }
        println()
    }


}

fun whenDemo() {
    //自动生成随机数
    //定义一个区间
    val qj = 0..10
    val take = qj.random()
    println("take:${take.toString()}")
    var index = 0
    while (true) {
        println("请输入你的值  你已经猜了:$index")
        var str = readLine()
        str = str.plus("")
        var obj: Int
        try {
            obj = str.toInt()
        } catch (e: Exception) {
            index++
            println("请输入数值类型")
            continue
        }
        when (obj) {
            in qj.first..(take - 1) -> println("小了")
            in (take + 1)..qj.last -> println("大了")
            take -> {
                index++
                println("恭喜你猜对了  你已经猜了：$index")
                return
            }
            else -> println("没猜对请输入正确的数值")
        }
        index++
    }

}

fun isNotNull(){
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    map.let {
        println(map.get("a"))
        println(map.size)
    }
}
fun arrofmin(size:Int):IntArray{
    return IntArray(size).apply { fill(-1) }
}
fun String.spcaceToCamelCase(){
    println("9527")
}
fun runDemo(){
    //run可以实现多次return在全部都输出return后才退出
    val a= run {
        println("run")
        println(9527)
        return@run 0
    }
    val b="string".run {
        println(this+"       ?")
        println(95271)
        6
    }
    println(a)
    println(b)
}
fun applyDemo(){
    //自带return this（this表示自己）
    val a="ok".apply {

    }
    println(a)
}
fun letDemo(){
    //let中没有this 用it代替了  最后一行默认是return表达式
    val a="join".let {
        println(it)
         3
    }
    println(a)
}
