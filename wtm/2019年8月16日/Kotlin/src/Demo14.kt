/**
 *公司：赛安服
 *  文件名：Demo14
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/23 17:43
 *  描述：
 *  @version（版本）：
 *
 */
fun main(args: Array<String>) {
    //定义一个Parent的类 但是他是向上造型出来的本质是Child类
    val parent: Parent =Child()
   //智能类型转换  判断 parent 是不是 Child类型
    if(parent is Child){
        //如果是就输出 Child的方法
        println(parent.name)
        println(parent.chod())
    }
    //定义一个可以是null的字符串
    val string:String?=null
//    if(string is String)
//    println(string.length)

    //如果string！=null
    if(string!=null) {
        //输出字符串的长度
        println(string.length)
    }

    //定义一个 Parent类
    val par:Parent =Parent()
    //对chld进行赋值 如果 强行转换失败就抛异常（强转）
//    val chld:Child?=par as Child
    //安全的类型转换 如果转换失败，返回null，不抛异常
    val chld:Child?=par as? Child
    if(chld is Child) println(chld.chod() + "2222")

    println(chld?.chod() + "11111")
// 判断 string是不是String类型 是则走下一步 不是就走括号外面的
    if(string is String) println(string.length)


}