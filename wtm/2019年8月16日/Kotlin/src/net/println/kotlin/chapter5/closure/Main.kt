package net.println.kotlin.chapter5.closure

/**
 * 闭包（函数式编程）
 */
val string="HelloWorld"
fun makeFun():()->Unit{
    var count=0
    return fun(){
        println(++count)
    }
}
fun fibonacci():()->Long{
    var first=0L
    var second=1L
    return fun():Long{
        val result=second
        second+=first
        first=second-first
        return result
    }
}
fun fibonaccis():Iterable<Long>{
    var first=0L
    var second=1L
    return  Iterable {
        // LongIterator是一个迭代器
        object :LongIterator(){
            override fun hasNext()=true

            override fun nextLong(): Long {
                val result=second
                second+=first
                first=second-first
                return result
            }
        }
    }
}
//fun add(x:Int)=fun (y:Int) = x+y
fun add(x:Int):(Int)->Int{
    return fun(y:Int):Int{
        println("x: $x")
        println("y: $y")
        return  x+y
    }
}
fun main() {
    val x= makeFun()
    x()
    x()
    val y= fibonacci()
    println(y())
    println(y())
    println(y())
    println(y())
    println()
    for (i in fibonaccis()){
        if(i>100)break
        println(i)
    }
    println()
    val add5= add(6)
    println(add5(2))
}