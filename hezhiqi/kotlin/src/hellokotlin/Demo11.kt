package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/28
 * @Description: hellokotlin
 * @version: 1.0
 *表达式练习
 */

val USERNAME = "hzq"
val PWD = "123"

fun main(args: Array<String>) {
    println("请输入用户名：")
    var username = readLine()
    println("请输入密码：")
    var pwd = readLine()

   //if else也有返回值，可以直接赋给一个变量，但是结构必须的写完整如下：
    var result = if(username== USERNAME && PWD==pwd){
        "恭喜登陆成功"
    }else{
       "密码或用户名错误，登陆失败"
    }
    println(result)

    //when表达式,从前向后当有一个条件成立是，就不执行后面的语句了
    var x = 4
    when(x){
        in 1..100 -> println("$x,在[1,100]区间")
        is Int -> println("$x，是一个整数")
    }


}