package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/27
 * @Description: hellokotlin
 * @version: 1.0
 *数组的相关练习
 */

val arrayOfInt:IntArray = intArrayOf(1,2,3,4,6)
val arrayOfChar:CharArray = charArrayOf('h','e','l','l','w','o','r','d')
val arrayOfString:Array<String> = arrayOf("我是","码农")

fun main(args: Array<String>) {
    //获取数组的长度
    val len:Int = arrayOfInt.size
    println(len)

    //遍历数组
    for(int in arrayOfInt){
        print("$int,")
    }

    println()
    for(char in arrayOfChar){
        print("$char,")
    }

    //获取数组指定下标的元素
    var chr:Char = arrayOfChar[0]
    println(chr)

    //将字符数组拼接成字符串
    var str:String = arrayOfChar.joinToString("")
    println(str)

    //数组的切片返回的是集合
    var list:List<Int> = arrayOfInt.slice(2..4)
    println(list)

    var arrayOfA:Array<A> = arrayOf(A(24,"hzq"),A(26,"llp"))
    println(arrayOfA)
    for(a in arrayOfA){
        println(a)
    }
}


class A(age:Int,name:String){
    var age:Int = age
    var name:String = name

    override fun toString(): String {
        return "$name:$age"
    }
}
