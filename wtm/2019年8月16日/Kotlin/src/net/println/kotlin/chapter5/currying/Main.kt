package net.println.kotlin.chapter5.currying

import net.println.kotlin.chapter3.st
import sun.plugin2.message.Message
import java.io.OutputStream

/**
 * 科理化
 * 把多个参数函数变成一系列单参数函数的变换
 * 即多元函数变成一元函数调用链
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
}
//封装科理化
fun <P1,P2,P3,R> Function3<P1,P2,P3,R>.curried()
    =fun(p1:P1)=fun(p2:P2)=fun(p3:P3)=this(p1,p2,p3)