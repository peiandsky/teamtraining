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
    val parent: Parent =Child()
   //智能类型转换
    if(parent is Child){
        println(parent.name)
        println(parent.chod())
    }
    val string:String?=null
//    if(string is String)
//    println(string.length)

    if(string!=null) {
        println(string.length)
    }

    val par:Parent =Parent()
    //对chld进行赋值 如果 强行转换失败就抛异常（强转）
//    val chld:Child?=par as Child
    //安全的类型转换 如果转换失败，返回null，不抛异常
    val chld:Child?=par as? Child
    if(chld is Child) {
        println(chld.chod() + "11111")
    }
    println(chld?.chod() + "11111")

    if(string is String)
        println(string.length)


}