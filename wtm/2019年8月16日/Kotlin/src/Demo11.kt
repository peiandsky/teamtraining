/**
 *公司：赛安服
 *  文件名：Demo11
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/23 15:01
 *  描述：
 *  @version（版本）：
 *
 */
val strin:String="HelloWorld"
val fromChars:String= String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))
fun main(args: Array<String>) {
    //Kotlin 的== 与 java的equest（）是等价的 即值是否相等
    println(strin==fromChars)
    //kotlin 的===与 java的 == 是等价的  即值得地址是否一致
    println(strin===fromChars)

    val arg1:Int=0
    val arg2:Int=1
    println("$arg1+$arg2=${arg1+arg2}")
    val  sayHello:String="Hello\"Trump\""
    println(sayHello)
    println("$1000")
    val salary:Int=1000
    println("$$salary")
    println("\$salary")
    //原始字符串
    val rawString:String="""
        \n
      \\\  $salary
      $ salary
        \t
        """
    println(rawString)
    println(rawString.length)
}