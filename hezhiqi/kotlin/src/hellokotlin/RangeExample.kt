package hellokotlin



/**
 * @author：HeZhiQi
 * @Date: 2019/8/27
 * @Description: hellokotlin
 * @version: 1.0
 *
 */
//区间的相关练习
var range1:IntRange = 0..1024//闭区间[0,1024]
var range2:IntRange = 0 until 1024//[0,1024)

fun main(args: Array<String>) {
    //判断区间是否为空
    var b1:Boolean = range1.isEmpty()
    println(b1)

    //判断该区间是否包括100，如果包括返回ture，反之返回false
    var b2:Boolean = range1.contains(100)
    println(b2)

    println(50 in range1)
    //遍历区间
    for(i in range1){
        print("$i,")
    }

    var range3:CharRange = 'a'..'z'
    //遍历区间
    println()
    for(cha in range3){
        print(cha+",")
    }

    var range4:CharRange = 'A'..'Z'
    println()
    for(cha in range4){
        print(cha+",")
    }

    //获取区间的第一个元素
    var firstChar:Char = range4.start
    println()
    println(firstChar)
    //获取区间的最后一个元素
    var lastChar:Char = range4.last
    println()
    println(lastChar)

    //获取对应元素的下标
    val index:Int = range4.indexOf('B')
    println(index)



}