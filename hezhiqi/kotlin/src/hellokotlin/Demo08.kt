package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/28
 * @Description: hellokotlin
 * @version: 1.0
 *lambdas表达式相关练习
 */

fun main(args: Array<String>) {
   //匿名函数的调用
   var s = sum(3,8)
   println(s)
    //lambdas表达式
    var s1 = sum1(3,6)
    println(s1)

    //遍历数组方式一
    for(i in args){
        println(i)
    }

    //遍历数组方式二
    args.forEach ForEach@{
        if(it=="c"){
        return@ForEach//跳出当前forEach循环
        }
        println(it)
    }

    println("跳出forEach循环")

}


//匿名函数
var sum = fun(a:Int,b:Int):Int{
    return a+b
}

//lambdas表达式
var sum1 = {a1:Int,b1:Int ->
    println("$a1 + $b1 = ${a1+b1}")
    a1+b1}