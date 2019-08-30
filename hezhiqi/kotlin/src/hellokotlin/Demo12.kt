package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/28
 * @Description: hellokotlin
 * @version: 1.0
 *循环相关练习
 */

fun main(args: Array<String>) {
        var list = ArrayList<Int>()
        list.add(1)
        list.add(6)
        list.add(9)
        list.add(100)
        for(i in list){
            println(i)
        }

    var x = 4
    while(x>0){
        x--
        println(x)
    }

    var y = 5
    do{
        println(y)
        y--
    }while(y>0)

}