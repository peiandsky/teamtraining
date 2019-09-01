/**
 *公司：赛安服
 *  文件名：Static
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 9:00
 *  描述：伴生对象，包级函数
 *  @version（版本）：
 *
 */
package net.println.kotlin.objects

fun main(args: Array<String>) {
    //包级函数
    val a = minOf(args[0].toInt(),args[1].toInt())
    val latitude=Latitude.ofDouble(3.0)
    val latitude2=Latitude.ofLatitude(latitude)
    println(Latitude.TAG)
}
//类私有化
class Latitude private constructor(val value:Double){
    //object 只有一个实例 (伴生对象)
    companion object {
        @JvmStatic//在java中调用是静态方法
        fun ofDouble(double: Double):Latitude{
            return Latitude(double)
        }
        fun ofLatitude(latitude:Latitude):Latitude{
            return Latitude(latitude.value)
        }
        @JvmField//在java中调用是静态属性
        val TAG:String="9527"
    }

}
