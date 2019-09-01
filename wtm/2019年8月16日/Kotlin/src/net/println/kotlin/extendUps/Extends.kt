/**
 *公司：赛安服
 *  文件名：Extends
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 9:52
 *  描述：扩展成员,扩展方法
 *  @version（版本）：
 *
 */
package net.println.kotlin.extendUps


fun main(args: Array<String>) {
    //正常扩展 (String.)
    println("abc".time(5))
    //使用operator关键字与times关键字扩展（简便方法）
    println("a"*16)
    //扩展的成员属性
    println("a".a)
    println("a".b)
    "a".b=3
    println("a".b)
}

fun String.time(int: Int):String{
    val stringBuilder=StringBuilder()
    for (i in 0 until int){
        stringBuilder.append(this)
    }
    return  stringBuilder.toString()
}

operator fun String.times(int: Int):String{
    val Builder=StringBuilder()
    for (i in 0 until int){
        Builder.append(this)
    }
    return  Builder.toString()
}

val String.a:String
    get() = "9527"
var String.b:Int
    get() =5
    set(value){
    }