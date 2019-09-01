/**
 *公司：赛安服
 *  文件名：Overloads
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 9:24
 *  描述：方法的重载
 *  @version（版本）：
 *
 */
package net.println.kotlin.overload
class  Overloads{
    fun a():Int{
        return  0
    }
    fun a(int: Int):Int{
        return int
    }
}

fun main(args: Array<String>) {
    //方法的重载
    val overloads=Overloads()
    println(overloads.a())
    println(overloads.a(2))
    //默认参数
    val overloadUps=OverloadUps()
    println(overloadUps.a())
    println(overloadUps.a(2))
}
class  OverloadUps{
    @JvmOverloads//由于java中没有默认参数添加注解java中也可以使用
    fun a(int: Int=0):Int{
        return int
    }
}