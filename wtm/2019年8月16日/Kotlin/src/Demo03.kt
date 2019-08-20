fun main(args:Array<String>){
    var a=1
    //使用变量名作为模板
    var s1="a = $a"
    a=2
    //使用表达式作为模板
    val s2="${s1.replace("is","was")},but now is $a"
    println(s2)
    var b=0
    var q="b = $b,a = $a"
    a=3
    val b1="${q}, but now is $a"
    println(b1)

}