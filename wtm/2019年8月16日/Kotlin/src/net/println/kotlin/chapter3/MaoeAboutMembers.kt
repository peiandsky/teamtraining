/**
 *公司：赛安服
 *  文件名：MaoeAboutMembers
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/27 14:25
 *  描述：成员变量。成员方法
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

class x {

}
class A{
    var b=0
        get() {
            println("这是get方法")
            return  field}
        set(value){
            println("这是set方法")
        }
//    lateinit  var  c:String
//    lateinit  var  d:x
//      val  e:x by lazy {
//        println()
//          x()
//    }
}

fun main(args: Array<String>) {
    val  num = A()
    num.b=666
}