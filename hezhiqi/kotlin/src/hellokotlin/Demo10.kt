package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/28
 * @Description: hellokotlin
 * @version: 1.0
 *基本运算符相关练习
 */

class Complex(var real:Double,var imaginary:Double){
    operator fun plus(other:Complex):Complex{
    return Complex(real+other.real,imaginary+other.imaginary)
    }

    operator fun plus(other: Int):Complex{
        return Complex(real+other,imaginary)
    }

    operator fun invoke():Double{
        return Math.hypot(real,imaginary)
    }

    override fun toString(): String {
        return "Complex(real=$real, imaginary=$imaginary)"
    }

}

fun main(args: Array<String>) {
    var c1 = Complex(3.0,5.0)
    var c2 = Complex(4.0,3.0)
//  var c3 = c1.plus(c2)
    var c3 = c1 + c2
    println(c3)

//    var c4 = c1.plus(10)
//    println(c4)
      var c4 = c1 + 4
      println(c4)

    println(c1.invoke())
}

