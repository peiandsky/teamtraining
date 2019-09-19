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
    //定义枚举的公用方法
    fun getTag():String{
        //int是枚举数的参数        name是枚举的名字
        return "ID:$int  , $name"
    }
        //重写toString（）方法
    override fun toString(): String {
        //name是枚举的名字       ordinal是参数值
        return "$name  $ordinal"
    }
}

fun main(args: Array<String>) {
    //运行Loglevel枚举类中 枚举是（DEBUG）中的getTag（）方法
    println(Loglevel.DEBUG.getTag())
    //运行Loglevel枚举类中 枚举是（DEBUG）中的ordinal（参数值）
    println(Loglevel.DEBUG.ordinal)
    //获取Loglevel枚举类中 使用枚举数并挨个遍历输出
   Loglevel.values().map(::println)
    //输出Loglevel枚举类中 枚举名字是DEBUG的值
    println(Loglevel.valueOf("DEBUG"))

    Loglevel.values().forEach(::print)
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