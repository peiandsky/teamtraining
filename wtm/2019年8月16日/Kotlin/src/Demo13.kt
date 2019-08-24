/**
 *公司：赛安服
 *  文件名：Demo13
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/23 17:00
 *  描述： 空类型与智能类型的转换
 *  @version（版本）：
 *
 */
fun  getName():String?{
    return "111"
}

fun main(args: Array<String>) {
    //java中的写法
//    val name=getName()
//    if(name==null){
//        println("字符串是null没有长度")
//    }else{
//        println(name.length)
//    }

    //定义一个常量 如果他的值是null就直接return 否则就走下一步
    val name:String=getName()?:return
    println(name.length)
    val valu:String?="HelloWorld"
    //两个！！号表示强制执行
    println(valu!!.length)

}