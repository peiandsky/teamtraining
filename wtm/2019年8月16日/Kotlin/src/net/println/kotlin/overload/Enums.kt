/**
 *公司：赛安服
 *  文件名：Enums
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 16:23
 *  描述：枚举
 *  @version（版本）：
 *
 */
package net.println.kotlin.overload

enum class Loglevel(val  int: Int){
    VERBOSE(0),DEBUG(1),INFO(2),WARN(3),ERROR(4),ASSERT(5);
    fun getTag():String{
        return "ID:$int  , $name"
    }

    override fun toString(): String {
        return "$name  $ordinal"
    }
}

fun main(args: Array<String>) {
    println(Loglevel.DEBUG.getTag())
    println(Loglevel.DEBUG.ordinal)
   Loglevel.values().map(::println)
    println(Loglevel.valueOf("DEBUG"))
}
class  Loglevel2 protected constructor(){
    //伴生对象
    companion object {
        val VERBOSE=Loglevel2()
        val DEBUG=Loglevel2()
        val INFO=Loglevel2()
        val WARN=Loglevel2()
        val ERROR=Loglevel2()
        val ASSERT=Loglevel2()
    }
}