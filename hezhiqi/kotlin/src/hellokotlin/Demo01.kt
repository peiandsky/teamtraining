package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/22
 * @Description: hellokotlin
 * @version: 1.0
 *
 */
/**
 * 基本数据类型类型的练习
 */
val maxInt:Int = Int.MAX_VALUE
val minInt:Int = Int.MIN_VALUE

fun main(args: Array<String>) {
    //声明一个boolean类型变量；
    val tboolean:Boolean = true
    println(tboolean)

    val fboolean:Boolean = false
    println(fboolean)

    //声明一个Int类型
    val aint:Int = 8
    println(aint)
    //十六进制
    val bint:Int = 0xff
    println(bint)
    //二进制
    val cint:Int = 0b0011
    println(cint)
    println(minInt)
    println(maxInt)

    //声明一个Long类型变量
    var along:Long = 557867
    val minLong:Long = Long.MIN_VALUE
    val maxLong:Long = Long.MAX_VALUE
    println(along)
    println(minLong)
    println(maxLong)

    //声明一个Double类型变量
    val adouble:Double = 56.0
    println(adouble)

    //声明一个Float类型变量,需要加一个f在后面
    val afloat:Float = 2.0f

    //输出不是一个数
    println(0.0f/0.0f)
}