package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/29
 * @Description: hellokotlin
 * @version: 1.0
 *抽象类相关练习
 */

abstract class People{
    open fun work(){

    }
}

class MaNong:People(){
    override fun work() {
        println("我是码农，疯狂demo")
    }
}

class Docter:People(){
    override fun work() {
        println("我是神生，专治疑难杂症")
    }
}


fun main(args: Array<String>) {
    var p:People = MaNong()
    p.work()
    var p1:People = Docter()
    p1.work()
}


