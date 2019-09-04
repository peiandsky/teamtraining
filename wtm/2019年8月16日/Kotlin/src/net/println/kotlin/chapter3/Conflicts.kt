/**
 *公司：赛安服
 *  文件名：Conflicts
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/30 16:18
 *  描述：分段函数
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3
interface  add{
    fun x():Int = 1
}
interface  bdd{
    fun x():Int = 0
}
abstract class cdd(){
    open fun x():Int =5
}
class  zdd(val y:Int):cdd(),add,bdd{
    override fun x(): Int {
        println("call x():Int in zdd")
        if(y>0){
            return y
        }else if (y<-200){
            return  super<bdd>.x()
        }else if(y<-100){
            return  super<add>.x()
        }else{
            return  super<cdd>.x()
        }
    }
}

fun main(args: Array<String>) {
    println(zdd(-55).x())
    println(zdd(-155).x())
    println(zdd(100).x())
    println(zdd(-99999).x())

}