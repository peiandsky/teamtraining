/**
 *公司：赛安服
 *  文件名：Sum
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/28 23:12
 *  描述：异常
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

fun main(args: Array<String>) {
        try {
            val arg1=args[0].toInt()
            val arg2:Int=args[1].toInt()
            println("$arg1 + $arg2 = ${arg1+arg2}")
        }catch (e:ArrayIndexOutOfBoundsException ){
            println("请重新输入两个整数")
        }catch (e:NumberFormatException){
            println("请输入整数类型")
        }catch (e:Exception){
            println("运行过程中发生未知错误")
        }finally {
            println("谢谢使用")
        }

}