package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/26
 * @Description: hellokotlin
 * @version: 1.0
 *空类型，智能转换练习
 */
//?表示返回的String可以为null ，如果不加？返回值为null编译会通不过
fun getName():String?{
    return null
}

fun main(args: Array<String>) {
    var name = getName()
    //如果name不为null就输出长度，为null就直接返回null
    println(name?.length)

    var str:String? = "hello"
    println(str!!.length)


}