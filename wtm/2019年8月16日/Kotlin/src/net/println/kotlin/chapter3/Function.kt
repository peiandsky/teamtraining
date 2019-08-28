/**
 *公司：赛安服
 *  文件名：Function
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/28 16:47
 *  描述：when表达式
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3


class Player{

}

fun main(args: Array<String>) {
    val x=5
    when(x){
        is Int -> println("Hello $x")
        in 1..100 -> println("$x is in 1..100")
        !in 1..100 -> println("$x is not 1..100")
        args[0].toInt() -> println("x==args[0]")
    }
    val mode=when{
        args.isNotEmpty()&&args[0]=="1"-> println("1")
        else -> println("2")
    }
}