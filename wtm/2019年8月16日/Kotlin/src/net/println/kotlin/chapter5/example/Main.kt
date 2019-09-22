package net.println.kotlin.chapter5.example

import java.io.File

fun main() {
    val map=HashMap<Char,Int>()
    //第一种统计字符串个数方法
//    val text= File("build.gradle").readText()
//            //filterNot(Char::isWhitespace)去除字符串中的空白行
//            .toCharArray().filterNot(Char::isWhitespace).
//                    forEach{
//                        val count =map[it]
//                        if(count==null)map[it]=1
//                        else map[it]=count+1
//                    }
//    map.forEach(::println)
    //第二种统计字符串个数方法
    File("build.gradle").readText()
            .toCharArray().filterNot(Char::isWhitespace)
            //groupBy { it }分组把对应的元素分成一组 没一组都是一个list集合
            .groupBy { it }
//            .map { it.key to it.value.size }
            .forEach(::println)

}