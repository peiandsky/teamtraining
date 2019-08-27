package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/23
 * @Description: hellokotlin
 * @version: 1.0
 *类和对象的初始化
 */
class Teacher constructor(val age:Int=30,val gender: String="女" ){
    init {
        println("一个Teacher被创建了")
    }

    override fun toString(): String {
        return "Teacher(age=$age, gender='$gender')"
    }



}

class Student(val age: Int=20,val gender: String="男"){
    init {
        println("一个学生被创建了")
    }

    override fun toString(): String {
        return "Student(age=$age, gender='$gender')"
    }

}

class Person{
    var a:Int = 10
    var b:String = "hzq"

    override fun toString(): String {
        return "$b"+"今年"+"$a"+"岁了"
    }
}

fun main(args: Array<String>) {
    val t:Teacher = Teacher()
    println(t)
    val s: Student= Student()
    println(s)
    var p:Person = Person()
    println(p)
}