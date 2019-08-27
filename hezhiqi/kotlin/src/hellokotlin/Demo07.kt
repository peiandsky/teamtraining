package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/27
 * @Description: hellokotlin
 * @version: 1.0
 *函数相关练习
 */

fun main(args: Array<String>) {
    checkArgs(args)
    val a:Int = args[0].toInt()
    val b:Int = args[1].toInt()
    println(a)
    println(b)
    val c = sum(a,b)
    println("$a+$b=$c")

    println(getNumber(4))
}

fun sum(a:Int,b:Int):Int{
    return a+b
}

fun checkArgs(args: Array<String>){
    if(args.size!=2){
        show()
        //终止程序运行
        System.exit(0)
    }
}

fun show(){
    println("请输入两个int型数")
}

//函数也可以不要函数名，但是必须要定义一个变量接收
val getNumber = fun(number:Int):Int{
    return number
}