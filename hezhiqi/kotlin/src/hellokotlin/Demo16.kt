package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/29
 * @Description: hellokotlin
 * @version: 1.0
 *接口与抽象类
 */

abstract class D{
    var i = 1

    //open修饰的函数，子类就可以重写该函数
   open fun hello(){
        println(i)
    }
}

interface E{
    var j:Int
    fun hello()

}

//F为D的实现类
class F:D(){
    override fun hello() {

    }
}

//实现一个接口
class G(override var j:Int):E{
    override fun hello() {
    }

}


