/**
 *公司：赛安服
 *  文件名：lnnerClass
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 15:55
 *  描述：内部类
 *  @version（版本）：
 *
 */
package net.println.kotlin.innerClass

open class  Outter{
    val a:Int=0

    //默认静态内部类
    class  Inner{

    }
    //非静态内部类
    inner class  Inners{
        val a:Int=5
        fun hello(){
            println(this@Outter.a)
            println(this.a)
        }
    }
}
//匿名内部类
interface  OnClickListener{
    fun onClick()
}
class View{
    var onClickListener:OnClickListener?=null
}

fun main(args: Array<String>) {
    //默认类不类是静态的
    val inner=Outter.Inner()
    //非静态内部类
    val outter=Outter()
    val Inners=outter.Inners().hello()
    //匿名内部类
    val view=View()
     view.onClickListener=object :OnClickListener{
         override fun onClick() {
         }
     }
    //匿名内部类可以实现继承类与多个接口
    view.onClickListener=object :Outter(),OnClickListener{
        override fun onClick() {
        }

    }
}
