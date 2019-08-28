package hellokotlin

/**
 * @author：HeZhiQi
 * @Date: 2019/8/28
 * @Description: hellokotlin
 * @version: 1.0
 *异常相关练习
 */

fun main(args: Array<String>) {
    var username = "hzq"
    var password = "666"
    println("请输入用户名：")
    var uname = readLine()
    println("请输入密码：")
    var pwd = readLine()
    try{
        if(username==uname && pwd==password){
           println("登录成功")
        }else{
            throw Exception("你输入的用户名或者密码错误")
        }
    }catch (e:Exception){
        println(e.message)
    }finally {
        println("不管有没有异常都会执行finally里面的语句")
    }
}





