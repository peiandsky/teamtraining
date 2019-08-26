/**
 *公司：赛安服
 *  文件名：Lambda
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/26 17:03
 *  描述：Lambda 表达式
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

val sum=fun (arg1:Int,arg2:Int):Int{return  arg1+arg2}
//Lambda表达式是
val summ={arg1:Int,arg2:Int ->
    println("$arg1 + $arg2 =${arg1+arg2}  666")
    arg1+arg2
}
//(Int,Int)->Int
fun main(args: Array<String>) {
    val are1=1
    val arg2=2
    println("$are1 + $arg2 =${sum(are1,arg2)}")
    println(111)
    println("$are1 + $arg2 =${summ(are1,arg2)}")
    //数组遍历 第一种
    for(i in args){
        println(i)
    }

    //数组遍历 第二种  it表示每个元素
    args.forEach {print(it)}
    println()
    //简化(终极版)
    args.forEach (::print)
    //标签的使用
    println()
    args.forEach ForEach@{
        if (it=="j") return@ForEach
        print(it)
    }
    println()
    println("The End")
    //
    println(sum)
//
//    for(i in args)ForEach@{
//        if (i=="a"){
//            return@ForEach
//        }
    }

