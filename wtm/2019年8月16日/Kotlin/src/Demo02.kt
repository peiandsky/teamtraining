import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

//返回一个没有意义的值(Unit)
fun printSum(a: Int, b: Int): Unit {
    println("和是 $a and $b 是 ${a + b}")
}

//Unit的返回值可以省略
fun printlnSum(a: Int, b: Int) {
    println("和是 $a and $b 是 ${a + b}")

}

/*
    这是块级注释
 */
fun main(args: Array<String>) {
    //printSum(1,2)
    printlnSum(1, 2)
    //声明常量
    val a: Int = 1 //
    val b = 2     //推导出Int型
    val c: Int   //当没有初始化值时必须声明类型
    c = 3         //赋值
    println("a=$a,b=$b,c=$c")
    //声明变量
    var x = 5 //推导除Int类型
    println(x)
    x += 1
    println(x)
}