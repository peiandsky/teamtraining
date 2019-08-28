/**
 *公司：赛安服
 *  文件名：loop
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/28 22:22
 *  描述：循环语句
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

import sun.awt.SunHints

fun main(args: Array<String>) {
    for (arg in args){
        println(arg)
    }
    for ((index,value)in args.withIndex() ){
        println("$index -> $value")
    }
    for (indexeValue in args.withIndex()){
        println("${indexeValue.index} -> ${indexeValue.value}")
    }
}