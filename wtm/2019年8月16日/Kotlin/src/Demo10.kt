/**
 *公司：赛安服
 *  文件名：Demo10
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/22 10:09
 *  描述：
 *  @version（版本）：
 *
 */

fun main(args: Array<String>) {
    var w=1;
    val b=w
    if(w!=1){
        w=1
    }
    val anInt:Int=5
    val along:Long=anInt.toLong()
    if(along is Long){
        println("anInt转换成along类型成功")
    }else{
        println("anInt转换成along类型失败")
    }

}
class  fus(){
    fun fn(a:Int,b:Int) :Int?{
        if (a>b){
            a
        }
        return null
    }
}