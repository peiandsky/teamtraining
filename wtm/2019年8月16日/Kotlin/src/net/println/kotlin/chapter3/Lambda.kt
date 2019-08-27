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

val sum = fun(arg1: Int, arg2: Int): Int { return arg1 + arg2 }
//Lambda表达式是
val summ = { arg1: Int, arg2: Int ->
    println("$arg1 + $arg2 =${arg1 + arg2}  666")
    arg1 + arg2
}


//(Int,Int)->Int
fun main(args: Array<String>) {
    val are1 = 1
    val arg2 = 2
    println("$are1 + $arg2 =${sum(are1, arg2)}")
    println(111)
    println("$are1 + $arg2 =${summ(are1, arg2)}")
    //数组遍历 第一种
    for (i in args) {
        println(i)
    }
    //数组遍历 第二种  it表示每个元素
    args.forEach { print(it) }
    println()
    //简化(终极版)
    args.forEach(::print)
    //标签的使用
    println()
    //第一种
     args.forEach forEach@  {//break
        if (it == "j") return@forEach
        print(it)
    }
    //第二种
    //定义一个Int类型的数组
    val intOf:IntArray= intArrayOf(1,3,5,4,6)
    //如果；里面那一层循环碰到是二的倍数是就通过标签跳到这个入口标签 并跳过这个forEach循环执行下一步
    forEach@for (out in intOf){
        println("   outer  $out 9999999999")
         for (ins in intOf){
            if (ins%2 ==0) break@forEach
             println("inner $ins")
        }
    }
    println("END : ")
    println(sum)

//    for(i in args)ForEach@{
//        if (i=="a"){
//            return@ForEach
//        }
}

