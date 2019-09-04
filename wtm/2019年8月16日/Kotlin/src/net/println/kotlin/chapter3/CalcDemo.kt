/**
 *公司：赛安服
 *  文件名：CalcDemo
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/29 10:54
 *  描述：计算器练习
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

import com.sun.org.apache.xml.internal.security.Init

fun main(args: Array<String>) {
    while (true){
        try {
            println("请输入算式例如： 3 + 4 ")
            val str = readLine() ?: break
            val selip = str.trim().split(" ")
            if(selip.size<3){
                throw  IndexOutOfBoundsException("参数个数不对")
            }
            val arg1 = selip[0].toDouble()
            val sal = selip[1]
            val arg2 = selip[2].toDouble()
            println("$arg1 $sal $arg2=${opser(sal).apple(arg1, arg2)}")
        }catch (e:IndexOutOfBoundsException){
            println("数字与符号间请用空格符分隔${e.message}")
        }catch (e:NumberFormatException){
            println("请输入数字类型")
        }catch (e:Exception){
            println("运行过程中发了未知错误 ${e.message}")
        }
        println("是否继续[X]")
        val st= readLine()
        if (st==null||"x"!=st.toLowerCase()){
            break
        }
    }
    println("欢迎下次再来")
}

class opser(op:String){
    val opFun:(left:Double,reigth:Double)->Double

    init{
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
    fun apple(left:Double,reigth:Double):Double{
        return opFun(left,reigth)
    }
}