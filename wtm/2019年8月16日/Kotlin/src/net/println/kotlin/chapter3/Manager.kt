/**
 *公司：赛安服
 *  文件名：Manager
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/30 15:55
 *  描述：面向对象和继承 （代理）
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

import java.io.Writer

interface  Driver{
    fun drive()
}
interface  Witer{
    fun writer()
}

open class  CarDriver:Driver{
    override fun drive() {
        println("开车中")
    }
}
open class PPTWriter:Witer{
    override fun writer() {
        println("写PPT中")
    }
}
class  Manager(val car: CarDriver,val ppt:PPTWriter):Driver by car,Witer by ppt{
}

fun main(args: Array<String>) {
    val car=CarDriver()
    val ppt=PPTWriter()
    val man= Manager(car,ppt)
    man.drive()
    man.writer()
}