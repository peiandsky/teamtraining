import school.chongqing.School as school

/**
 *公司：赛安服
 *  文件名：Demo16
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/25 22:43
 *  描述：数组
 *  @version（版本）：
 *
 */
val arrayOfInt: IntArray = intArrayOf(1, 3, 4, 7)//Int类型的数组
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'r', 'r', 'o', 'W', 'o', 'r', 'l', 'd')//char类型的数组
val arrayOfString: Array<String> = arrayOf("我", "是", "码农")//String数组
val arrayOfSchool: Array<school> = arrayOf(school("张"), school("陈"), school("刘"))//自定义类型数组

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (i in arrayOfChar) {
        print("$i,")//打印数组
    }
    println()
    println(arrayOfSchool[1])//输出数组对应的元素
    for (i: school in arrayOfSchool) {
        print("$i,")
    }
    println()
    arrayOfSchool[1] = school("魏")//修改数组对应的元素
    println(arrayOfSchool[1])
    for (i: school in arrayOfSchool) {
        print("$i,")
    }
    println()

    println(arrayOfChar.joinToString(""))
    println(arrayOfInt.slice(1..2))//获取第2个到第三个数区间的数（获取索引值是1到2的区间数）


    println(kotlin("3", "2"))
}

open class kotlin public constructor(var name: String = "xx", var passwosrdd: Int = 55) {


    var password: String = ""

    init {
        println("初始化方法")
    }

    constructor(name: String, password: String) : this() {
        this.password = password
        println("次级构造器")
        println("${name}  ${password} ")
    }

    override fun toString(): String {
        return "${name}   ${password}  "
    }

}