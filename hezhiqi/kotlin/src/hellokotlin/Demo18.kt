package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/29
 * @Description: hellokotlin
 * @version: 1.0
 *接口的代理相关练习
 */

interface Driver{
    fun driver()
}

interface Writer{
    fun writer()
}

class CarDriver:Driver{
    override fun driver() {
        println("我是小车司机")
    }
}

class PPTWriter:Writer{
    override fun writer() {
        println("我是秘书")
    }
}
//接口的代理，此时就不需要重写接口中的方法了
class Manager(var driver: Driver,var writer: Writer):Driver by driver,Writer by writer


fun main(args: Array<String>) {
    var driver = CarDriver()
    var writer = PPTWriter()
    var manager = Manager(driver,writer)
        manager.writer()
        manager.driver()

}