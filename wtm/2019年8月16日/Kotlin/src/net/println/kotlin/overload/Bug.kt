/**
 *公司：赛安服
 *  文件名：Bug
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 9:39
 *  描述：方法重载的BUG
 *  @version（版本）：
 *
 */
package net.println.kotlin.overload

fun main(args: Array<String>) {
    val integerList=ArrayList<Int>()
    integerList.add(1)
    integerList.add(2)
    integerList.add(3)
    integerList.add(4)
    integerList.add(9)
    integerList.add(6)
    integerList.add(7)
    println(integerList)
    //按值匹配删除
    integerList.remove(1)
    integerList.remove(5)
    println(integerList)
    //按索引匹配删除 [2, 3, 4, 9, 6, 7]
    //删除后长度减1
    integerList.removeAt(1)
    integerList.removeAt(4)
    println(integerList)
}
