package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/29
 * @Description: hellokotlin
 * @version: 1.0
 *变长参数的练习
 */

fun main(args: Array<String>) {
    //变长参数可以传入多个参数
    changeLength(20,19,34,32,name = "变长参数")

    var array = intArrayOf(1,3,5,7)
    changeLength(*array,name="变长参数也可以传入数组")

    //设置了默认的参数值时，可以不用传参
    changeLength(*array)
}


fun changeLength(vararg ints:Int,name:String="默认参数值"){
    ints.forEach {
        println(it)
    }

    println(name)
}