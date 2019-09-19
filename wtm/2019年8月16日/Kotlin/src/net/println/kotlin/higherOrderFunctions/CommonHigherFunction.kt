package net.println.kotlin.higherOrderFunctions

fun main() {
    val list= listOf(1,3,5,7,9,11,13,15,17)
    list.forEach(::println)
    //JAVA中的写法
    val newList=ArrayList<Int>()
    list.forEach{
            val newElement=it*2 +3
        newList.add(newElement)
    }
    newList.forEach(::println)
    //kotlin的写法
    val newList01=list.map {
        it*2+3
    }
}