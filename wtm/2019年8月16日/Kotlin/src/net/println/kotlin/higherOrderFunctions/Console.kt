/**
 *公司：赛安服
 *  文件名：Extends
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/16 10点17分
 *  描述：高阶函数
 *  @version（版本）：
 *
 */
package net.println.kotlin.higherOrderFunctions

fun main(args: Array<String>) {
    //函数引用得3三种方式
    // 第一种 包级函数
   args.forEach (::println)
    //第二种（类名：：方法名） （类名引用有一个隐含参数是调用者它本身）
    val helloWorld=Hello::world
    args.filter (String::isNotEmpty)
    args.forEach (::println)
    //第三种      （调用者引用）
    val pdfPrinter=pdfPrinter()
    args.forEach (pdfPrinter::println)

}
class pdfPrinter{
    fun println(any:Any){
        kotlin.io.println(any)
    }
}
class  Hello{
    fun world(){
        println("Hello world")
    }
}

