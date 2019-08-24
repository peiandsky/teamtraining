/**
 *公司：赛安服
 *  文件名：Demo12
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/23 15:49
 *  描述： 类和对象的初始化
 *  @version（版本）：
 *
 */

class 小姐姐( 性格:String, 声音:String, 长相:String):人(性格,声音,长相)
class 帅哥( 性格:String, 声音:String, 长相:String):人(性格,声音,长相){

}
open class 人(var 性格:String, var 声音:String, var 长相:String){
    var str=""
    //属性再次赋值必须在方法中完成
    fun  gender(){
     if(长相=="帅气"){
        str="他"
     }else{
        str="她"
        }
    }
    init {
        gender()
        println("创建了一个${this.javaClass.simpleName} $str 的性格：$性格      长相：$长相       声音：$声音 ")
    }

}

fun main(args: Array<String>) {
    val 我喜欢的小姐姐:小姐姐=小姐姐("温柔","动人","甜美")
    val 一个的小哥哥:帅哥=帅哥("阳光","浑厚","帅气")
}
