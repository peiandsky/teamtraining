/**
 *公司：赛安服
 *  文件名：Main
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/26 15:47
 *  描述：数据结构
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3
//常量  与java中的Final int 类型一致  是运行期常量
    val FINAL_HELLO_WORLD:String="HelloWorld"
//编译期常量 与java中Final int 完全一致 都是编译期常量
    const val x=2
//变量
    var str:String="1"
//类型推导 常量
    val FINAL_HELLO_CHINA="HelloChina"
//类型推导  变量
    var st="9"
fun main(args: Array<String>) {
    println(FINAL_HELLO_WORLD)
    println(FINAL_HELLO_CHINA)
    println(str)

    //自动推导成为字符串
    st+=2
    println(st)
    println("hello  ${args[0]}")

    checkArgs(args)
    val  arg1=args[0].toInt()
    val  arg2=args[1].toInt()
    println("$arg1  + $arg2  =${sum(arg1,arg2)}")
    //匿名函数的调用
    println(check(5))
}
fun checkArgs(args: Array<String>){
    if(args.size!=2){
        printUsage()
        System.exit(0)

    }
}
fun  printUsage(){
    println("请输入 两个int类型 例如 1  2 ")
}

//fun sum(arg1:Int,arg2: Int) :Int{
//    return  arg1+arg2
//}
//简便写法
 fun  sum(arg1:Int,arg2: Int) = arg1+arg2
//匿名函数(听说是神一样的存在)
var check=fun(ins:Int):Long{
    return  ins.toLong()
}