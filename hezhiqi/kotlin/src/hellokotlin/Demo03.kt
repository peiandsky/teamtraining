package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/26
 * @Description: hellokotlin
 * @version: 1.0
 *基础数据类型的转换及字符串相关练习
 */

var a:Int = 10

fun main(args: Array<String>) {
    //将Int类型转换成Long类型
    var b:Long = a.toLong()
    println(b)

    //将Int类型转换成Double类型
    var d:Double= a.toDouble()
    println(d)

    //将Int类型转换成String类型
    var str:String = a.toString()
    str = str+2
    println(str)

    var s:String = "helloword"
    var s1:String = "helloword"
    var s2:String = "hello"+"wor"
    var s3:String = String(charArrayOf('h','e','l','l','o','w','o','r','d'))
    //==比较的是内容等效于java中equels()
    println(s==s1)
    println(s==s2)
    println(s==s3)
    //===比较的引用
    println(s===s1)
    println(s===s2)
    println(s===s3)

    var aInt:Int = 1
    var bInt:Int = 2
    println("$aInt+$bInt=${aInt+bInt}")


}