fun main(args: Array<String>) {
    val  items= listOf("apple","banana","kiwi")
    var  index=0
    //while循环
    while (index<items.size){
        println("$index    = ${items[index]}")
        println(""+index+" = "+items[index] )
        index++
    }


}