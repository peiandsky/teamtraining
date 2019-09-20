package net.println.kotlin.chapter5.builtins

import java.io.BufferedReader
import java.io.FileReader

data class Person(val name:String,val age:Int){
    fun work(){
        println("$name is working!!!")
    }
}

fun main() {
//    val person= findPerson()
//    println(person?.name)
//    println(person?.age)
//
//    findPerson()?.let { person->
//        println(person.name)
//        println(person.age)
//        person.work()
//    }
//        读取txt文件的     第一种方式
        val br=BufferedReader(FileReader("hello.txt"))
        with(br){
            var line:String?
            while (true) {
                line = readLine() ?: break
                println(line)
            }
            close()
        }
//         读取txt文件的     第二种方式
        val br2=BufferedReader(FileReader("hello.txt")).readText()
        println(br2)
//          读取txt文件的       第三种方式
        BufferedReader(FileReader("hello.txt")).use {
            var li:String?
            while (true){
                li = it.readLine()?:break
                println(li)
            }
        }
}
fun findPerson(): Person? {
    return null
}