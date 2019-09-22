package net.println.kotlin.chapter5.currying

import net.println.kotlin.chapter3.st
import sun.plugin2.message.Message
import java.io.OutputStream
import java.nio.charset.Charset

/**
 * 科理化
 * 把多个参数函数变成一系列单参数函数的变换
 * 即多元函数变成一元函数调用链
 *
 * 偏函数
 *  -传入部分参数得到的新函数
 */

//多个参数函数
fun hello(x:String,y:Int,z:Double):Boolean{
    return  true
}
//多个参数函数
fun log(tag:String,target:OutputStream,message:Any?){
    target.write("[$tag] $message\n".toByteArray())
}
//单参数函数(科理化)
//fun log(tag:String)
//        =fun(target:OutputStream)
//        =fun(message:Any?)
//                = target.write(("[$tag] $message\n".toByteArray()))

fun main() {
    //调用原始版本
    log("str",System.out,"HEELOWorld")
    //使用科理化版本
//    log("st")(System.out)("HelloWorld Again")
    //调用封装后的科理化
    ::log.curried()("ss")(System.out)("HelloWorld currying")
    //偏函数与科理化有一定关系
    val consoleLogWithTag=(::log.curried())("sp")(System.out)
    consoleLogWithTag("9")
    consoleLogWithTag("5")
    consoleLogWithTag("2")
    consoleLogWithTag("7")
    val bytes="我来自重庆合川我的目标是做一个包租公".toByteArray(charset("GBK"))

    val str=makeStringFromGbkBytes(bytes)
    println(str)

}
//封装科理化
fun <P1,P2,P3,R> Function3<P1,P2,P3,R>.curried()
    =fun(p1:P1)=fun(p2:P2)=fun(p3:P3)=this(p1,p2,p3)

//偏函数例子
val makeString=fun(byteArrat:ByteArray,charset:Charset):String{
    return  String(byteArrat,charset)
}
val makeStringFromGbkBytes= makeString.partial2(charset("GBK"))
fun<P1,P2,R> Function2<P1,P2,R>.partial2(p2:P2)
    =fun (p1:P1)=this(p1,p2)
fun<P1,P2,R> Function2<P1,P2,R>.partial1(p1:P1)
        =fun (p2:P2)=this(p1,p2)