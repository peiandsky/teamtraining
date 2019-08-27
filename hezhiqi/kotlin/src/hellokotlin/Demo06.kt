package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/27
 * @Description: hellokotlin
 * @version: 1.0
 *常量与变量
 */


fun main(args: Array<String>) {
    //val修饰的是常量，不可以重新赋值
    val num:Int = 100
    println(num)

    //var修饰的是变量
    var hw:String = "HELLOWORD"
        hw = "helloword"//再次需改变量hw

    //类型的推导，可以省略类型
    val str = "hello"
    var number = 30
    var p = Person()


}