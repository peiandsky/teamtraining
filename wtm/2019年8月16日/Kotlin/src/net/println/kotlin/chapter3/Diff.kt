/**
 *公司：赛安服
 *  文件名：Diff
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/30 10:02
 *  描述：类呃单继承多实现
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

import com.sun.org.apache.xml.internal.security.Init

interface  B{
    var  j:Int
    fun hello(tet:String){
            if(tet == "B"){
                println("接口：$tet   $j")
            }
    }
}
interface C{
    var  i:Int
    fun hello( tet:String){
            if(tet == "C"){
                println("接口：$tet   $i")
            }
        }
}
//如果是正常类则需要使用open打开 不然不能继承
 open class  Moth(var arg1:Int){
    fun reg(){
        println("类名："+this.javaClass.superclass.name.split(".")[this.javaClass.name.split(".").size-1]+"   $arg1")
    }
}
//单继承多实现
class  MothIght( override var j: Int, override var i: Int,arg1: Int):Moth(1),B,C{
    //出现同名方法的解决方案
    override fun hello( str:String){
        for(w in this.javaClass.interfaces) {
            var inter = w.name
            var st=inter.split(".")[inter.split(".").size-1]
            super<B>.hello(st)
            super<C>.hello(st)
        }
    }
   init {
       super.arg1=arg1
       println("类名： "+this.javaClass.name.split(".")[this.javaClass.name.split(".").size-1])
   }
}

fun main(args: Array<String>) {
    val moths=MothIght(5,6,3)
    moths.reg()
    moths.hello("")
    var bo:BooleanArray= booleanArrayOf(false,false,false,false)
    val str:String="9527"

    while (true) {
        if (moths is B&&bo[0]==false) {
            println("moths  包含了 B")
            bo[0]=true
        } else if (moths is C&&bo[1]==false) {
            println("moths  包含了 C")
            bo[1]=true
        } else if (moths is Moth&&bo[2]==false) {
            println("moths  包含了 Moth")
            bo[2]=true
        } else {
            println("其他")
            break
        }
    }

}