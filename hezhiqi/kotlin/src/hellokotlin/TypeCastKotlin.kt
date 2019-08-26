package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/27
 * @Description: hellokotlin
 * @version: 1.0
 *
 */

fun main(args: Array<String>) {
    var p:Parent = Child()
    if(p is Child){
        println(p.name)
    }
}