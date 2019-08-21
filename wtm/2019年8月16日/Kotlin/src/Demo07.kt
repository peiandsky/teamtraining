//is的使用
fun getStringLengths(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
//或者再简便一下
fun  getStringLengthss(obj: Any):Int?{
    if (obj!is String) return  null
    return obj.length
}
//甚至这样
fun getStringLengthsup(obj: Any):Int?{
    if (obj is String&&obj.length>0){
        return  obj.length
    }
    return  null
}
fun main(args: Array<String>) {
    println(getStringLengths(1))
    println(getStringLengths("1"))
    println(getStringLengthss(22))
    println(getStringLengthss("22"))
    println(getStringLengthsup(333))
    println(getStringLengthsup("333"))
    //循环
    val items= listOf("apple","banana","kiwi")
//for循环 自定义（代值） 格式   集合
    for (ite in items){
        //类似javafor循环遍历
        println(ite)
    }
    //或者
//for循环 自定义（索引值） 格式   集合的索引数组
    for (index in items.indices){
        println("item at $index   =   ${items[index]}")
    }

}