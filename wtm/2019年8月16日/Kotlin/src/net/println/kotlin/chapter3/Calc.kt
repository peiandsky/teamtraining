/**
 *公司：赛安服
 *  文件名：Calc
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/29 10:07
 *  描述：计算器
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

import java.lang.UnsupportedOperationException
import javax.swing.text.html.HTML.Tag.I

fun main(args: Array<String>) {
    while (true){
        try {
    println("请输入算式例如：3 + 4")
    val input= readLine()?:break
        val spits=input.trim().split(" ")
            if(spits.size<3){
                throw IllegalArgumentException("参数个数不对")
            }
        val  arg1=spits[0].toDouble()
        val op=spits[1]
        val  arg2=spits[2].toDouble()
        println("$arg1 $op $arg2=${Operator(op).apply(arg1,arg2)}")
        }catch (e:NumberFormatException){
            println("你确定输入的是数字？")
        }catch (e:IllegalArgumentException){
            println("${e.message}:  数字与符号间请按空格符分隔")
        }catch (e:Exception){
            println("你的人品太差，程序遇到未知异常，${e.message}")
        }
        println("要再来一发?[X]")
        val cmd= readLine()
        if (cmd==null||cmd.toLowerCase()!="x"){
            println("欢迎下次在来")
//            System.exit(0)
            break
        }
    }
    println("感谢你使用我们的计算器")
}
class  Operator(op:String){
    val opFun:(left:Double,right:Double)->Double
    init {
        opFun=when(op){
          "+"  ->{l,r -> l+r}
          "-"  ->{l,r -> l-r}
          "*"  ->{l,r -> l*r}
          "/"  ->{l,r -> l/r}
            "%"  ->{l,r -> l%r}
        else ->{
            throw UnsupportedOperationException(op)
             }
        }
    }
    fun apply(left: Double,right: Double):Double{
        return opFun(left,right)
    }

}
