package net.println.kotlin.chapter5.builtins

import java.lang.StringBuilder


/**
 * 常见高阶函数
 */
fun main() {
    val list= listOf(
            1..20,
            2..5,
            100..365
    )
    val flatList=list.flatMap {it }
    flatList.forEach(::println)
    //求和
    println( "求和为："+flatList.reduce { acc, s -> acc+s })
    //阶乘
    (1..9).map (::factorial).forEach{
        println(it)
    }
    (1..9).map (::factorial).forEachIndexed { index, i -> println("前"+index+"数的乘积是："+i) }
    //字符串拼接
    println((0..6).map (::factorial).fold(StringBuilder()){acc, i ->
        acc.append(i).append(",")
    })
    println((0..6).joinToString(","))
    //过滤(filter)
    (0..6).forEach(::print)
    println((0..6).map(::factorial).filter{it%2==1})
    //不满足条件时执行之前符合条件的
    println((0..6).map(::factorial).takeWhile { it%2==1 })
}
fun factorial(n:Int):Int{
   if (n==0)return 1
    return (1..n).reduce{acc,i -> acc*i}
}