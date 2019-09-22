package net.println.kotlin.chapter5.compose

/**
 *  函数复合（f(g(x)),infix）
 */
//f(g(x))       m(x)=f(g(x))
val add5={i:Int->i+5}       //g(x)
val multiplyBy2={i:Int->i*2}        //f(x)
fun main() {
    println(multiplyBy2(add5(5)))//(5+5)*2
    val add5AndMultiplyBy2=add5 andThen multiplyBy2
    println(add5AndMultiplyBy2(8))  //m(x)=f(g(x))
    val add5composeMultiplyBy2=add5 compose multiplyBy2
    println(add5composeMultiplyBy2(8))  //m(x)=g(f(x))
}
//复合函数
infix fun<P1,P2,R> Function1<P1,P2>.andThen(function: Function1<P2,R>):Function1<P1,R>{
    return fun(p1:P1):R{
        println(p1)
        return  function.invoke(this.invoke(p1))
    }
}
infix  fun<P1,P2,R> Function1<P2,R>.compose(function: Function1<P1,P2>):Function1<P1,R>{
    return  fun (p1:P1):R{
        println(p1)
        return  this.invoke(function.invoke(p1))
    }
}


