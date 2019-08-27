/**
 *公司：赛安服
 *  文件名：Demo11
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/23 15:01
 *  描述：基础数据类型转换与字符串 二
 *  @version（版本）：
 *
 */
//声明一个String类型的字符串并赋值"HelloWorld"
val strin: String = "HelloWorld"
//声明一个String类型的字符串使用String的构造方法赋值（构造方法是 String(charArrayOf())）
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

fun main(args: Array<String>) {
    //Kotlin 的== 与 java的equest（）是等价的 即值是否相等
    println(strin == fromChars)
    //kotlin 的===与 java的 == 是等价的  即值得地址是否一致
    println(strin === fromChars)
    //定义一个Int类型的常量
    val arg1: Int
    //把未赋值的arg1常量进行初始化赋值1
    arg1 = 1
    //定义一个Int类型的常量并赋值为1
    val arg2: Int = 1
    println("$arg1+$arg2=${arg1 + arg2}")
    //定义一个String类型的常量并赋值为"Hello\"Trump\""（其中\"为转译字符 即输出"）
    val sayHello: String = "Hello\"Trump\""
    val sayhe: String = "Hello"
    //判断两个字符串是否相等
    println("${sayHello.contentEquals(sayhe)} kkkkkkkkkkkkkkkkkkkk")
    println(sayHello)
    //获取字符串的索引值是0的字符
    println(sayHello[0])
    //舍弃子串系列
    //舍弃最前3个字符 返回值是舍弃后的字符串并且是一个新的字符串
    println(sayHello.drop(3))
    println(sayHello)
    //舍弃末位3个字符 返回值是舍弃后的字符串并且是一个新的字符串
    println(sayHello.dropLast(3))
    println(sayHello)
    //拿取系列
    val str: String = "952712138"
    //拿取最前3个字符 返回值是拿取的字符串并且是一个新的字符串
    println(str.take(3))
    println(str)
    //拿取末位3个字符 返回值是拿取的字符串并且是一个新的字符串
    println(str.takeLast(3))
    //替换
    println(str.replace("1", ""))

    println("$1000")
    val salary: Int = 1000
    println("$$salary")
    println("\$salary")
    //原始字符串(""")
    val rawString: String = """
        \n
      \\\  $salary
      $ salary
        \t
        """
    println(rawString)
    println(rawString.length)
    //字符
    val you = '你'
    val one = '1'
    //判断该字符是否是数字
    println("$you 它是数字么  ${you.isDigit()}")
    println("$one 它是数字么  ${one.isDigit()}")
    println()
    //判断该字符是否是文字
    println("$one 它是文字么  ${one.isLetter()}")
    println("$you 它是文字么  ${you.isLetter()}")
    //字符的加减（由于字符底层是Int类型 所以他的加减只是对应了不同的字符）
    println(you + 1)
    //查看某个字符的编码
    println(you.toInt())
    println('a'.toInt())
}