/**
 *公司：赛安服
 *  文件名：Demo15
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/25 22:27
 *  描述：区间
 *  @version（版本）：
 *
 */
val rager:IntRange=0..1024//是一个闭区间 [0-1024]的取值范围  ..是运算符的意思
val ragercluslve:IntRange=0 until 1024//是一个半开区间     [0-1024） 或[0-1023]
val  enmatRange: IntRange=0..-1
fun main(args: Array<String>) {
    println(enmatRange.isEmpty())//判断区间是不是空的 如果是true 这代表里面没有值  如果是false
    println(rager.contains(50))//判断区间是否包含50  如果包含则返回true   如果不包含则返回false
    println(50 in rager)//与上面的意思完全一致

    for (i in ragercluslve){//循环打印区间的所有值
        print("$i,")
    }
}