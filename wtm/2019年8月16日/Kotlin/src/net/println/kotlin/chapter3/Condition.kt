/**
 *公司：赛安服
 *  文件名：Condition
 *  @author（作者）：Administratora
 *  @time（时间）：2019/8/28 15:34
 *  描述：表达式
 *  @version（版本）：
 *
 */
package net.println.kotlin.chapter3

private  const val USERNAME="kotlin"
private  const val PASSWORD="9527"

private  const val ADMIN_USER="admin"
private  const val ADMIN_PASSWORD="admin"

private  const val DEBUG=1
private  const val USER=0

fun main(args: Array<String>) {

    val mode= if(args.isNotEmpty()&&args[0]==DEBUG.toString()){
         DEBUG
    }else{
        USER
    }
    println("请输入用户名：")
    val username= readLine()
    println("请输入密码")
    val password= readLine()
    if (username== ADMIN_USER&&password== ADMIN_PASSWORD){
        println("管理员登陆")
    }else if(username== USERNAME&&password== PASSWORD){
        println("登陆成功")
    }else{
        println("登陆失败")

    }
}
