import com.sun.org.apache.bcel.internal.generic.NEW
import java.io.BufferedReader
import java.util.*

//Kotlin 类名
class Num() {
    //fun 方法名（参数a,参数b）：返回值类型{
    //     return 返回值 }
    
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

//开始的main方法入口
fun main(args: Array<String>) {
    //定义一个变量（他可以被修改） w被赋值为某个方法
    var w = Num().sum(8, 1)
    //输出一句话不换行
    print("8+11=")
    //输出那个变量
    println(w)
    //对变量进行再次赋值
    w = Num().sum(10, 15)
    println("再次赋值的值为" + w)

    //定义一个不能被修改的变量 并给他赋值
    val z = Num().sum(10, 11)
    println("不能修改的变量他的值是：" + z)

    //再次赋值失败
    //  z=Num().sum(1,2)
}


