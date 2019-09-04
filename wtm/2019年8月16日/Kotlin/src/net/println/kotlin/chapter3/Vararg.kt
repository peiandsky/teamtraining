/**
 *公司：赛安服
 *  文件名：Vararg
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/29 9:36
 *  描述：具名参数与变长参数
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3
fun summ(arg1:Int,arg2:Int)=arg1+arg2
fun main(args: Array<String>) {
    //具名参数
    println(summ(arg1=2,arg2 = 3))

    var arror:IntArray= intArrayOf(6,5,4,8,9)
    //变长参数  若是双参数或以上要用具名参数区分
    hello(1,3,4,5,string = "我是具名参数",double = 6.0)
    //可以使用数组类型作为参数 用*数组名调用
    hello(*arror,string = "我是具名参数",double = 6.0)
    //默认参数
    hello(6,3,2,4,string = "我是具名参数")
}
//变长参数
fun hello(vararg ints:Int,string: String,double:Double=3.0){
    ints.forEach (::print)
    println()
    println(string)
    println(double)
}
