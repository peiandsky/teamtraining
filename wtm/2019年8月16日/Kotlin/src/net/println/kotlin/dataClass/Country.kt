/**
 *公司：赛安服
 *  文件名：Country
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 15:20
 *  描述：Data 关键字
 *  @version（版本）：
 *
 */
package net.println.kotlin.dataClass

data class  Country(val id:Int,val name:String){

}

fun main(args: Array<String>) {
    val charna=Country(0,"中国")
    println(charna)
    println(charna.component1())
    println(charna.component2())
    val conu=Conuty()
    val (a,b,c,d)=conu
    println("$a $b$c$d")

}
class Conuty{
   operator fun component1():String{
        return "你好我是"
    }
    operator fun component2():Int{
        return 1
    }
    operator fun component3():Int{
        return 1
    }
    operator fun component4():Int{
        return 9
    }
}