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

    findPerson()?.let { person->
        println(person.name)
        println(person.age)
        person.work()
//        读取txt文件
        val br=BufferedReader(FileReader("he"))

    }
}
fun findPerson(): Person? {
    return null
}