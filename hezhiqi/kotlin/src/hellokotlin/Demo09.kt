package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/28
 * @Description: hellokotlin
 * @version: 1.0
 *类成员（成员变量、成员方法）相关练习
 */

class B {
    var age = 0
    //lateinit 告诉编译器会妥善处理
    lateinit var gender:String
    lateinit var address:String
    lateinit var name:String


    fun study(){
        println("$name,正在学习")
    }

    fun sleep(){
        println("$name,正在睡觉")
    }

    fun eat(){
        println("$name,正在吃饭")
    }

    override fun toString(): String {
        return "B(age=$age, gender='$gender', address='$address', name='$name')"
    }


}


class C (var name:String,var age:Int){

    fun work(){
    println("$name,去上班了")
    }

    override fun toString(): String {
        return "C(name='$name', age=$age)"
    }


}


fun main(args: Array<String>) {
    var b = B()
    b.name = "何志奇"
    b.age = 25
    b.gender = "男"
    b.address = "重庆"
    println(b)

    b.eat()
    b.sleep()
    b.study()

    //利用构造方法创建对象及定义属性
    var c = C("hzq",90)
    println(c)
    println(c.age)
    println(c.name)
    c.work()
}