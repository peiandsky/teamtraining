/**
 *公司：赛安服
 *  文件名：Complex
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/28 9:58
 *  描述： 运算符
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3
//定义Complex类并带有两个参数
data class Complex (var real:Double,var imagqinary:Double){
    //重载 Complex类       返回值类型是Complex类
    operator  fun  minus(other:Complex):Complex{
        //重载的Complex类的值等于
        return  Complex(real+other.real,imagqinary+other.imagqinary)
    }

    override fun toString(): String {
        return "real: $real     imagqinary:$imagqinary"
    }
}

fun main(args: Array<String>) {
    val c1=Complex(2.0,3.0)
    //Complex类
    println(c1)
    //重载后的Complex类
    println(c1.minus(c1))
    //练习
    val c2=Com(5,6)
    println(c2)
    println(c2.plus(c2))
    println(c2+c2)
    //例子
    var a=1
    var b:Boolean=true
    println(a)
    println(b.not())
    //活得args数组中中指定元素的位置和后面一个位置
    if("-name" in args){
        println(args[args.indexOf("-name")+1])
    }
}

data class  Com(var num:Int,var index:Int){
    operator fun plus(oths:Com):Com{
        return Com(num+oths.num,index+oths.index)
    }
}





