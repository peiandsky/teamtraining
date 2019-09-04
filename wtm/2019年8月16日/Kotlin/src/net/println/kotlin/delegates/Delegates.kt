/**
 *公司：赛安服
 *  文件名：Delegates
 *  @author（作者）：Administratora
 *  @time（时间）：2019/9/1 14:51
 *  描述：属性代理
 *  @version（版本）：
 *
 */
package net.println.kotlin.delegates

import net.println.kotlin.chapter3.x
import kotlin.reflect.KProperty

class  Delegates{
    val hello by lazy { "HelloWorld" }
    //常量属性只有getValue
    val hello2 by X()
    //变量属性有getValue  和 setValue
    var hello3 by X()
}
class X{
    private  var value:String?=null
    operator fun  getValue(thisRef: Any?, property: KProperty<*>): String{
        println("getValue:$thisRef -> ${property.name}")
        return this.value.toString()
    }
    operator fun  setValue(thisRef: Any?, property: KProperty<*>,value: String){
        println("setValue:$thisRef -> ${property.name} = $value")
        this.value=value
    }
}

fun main(args: Array<String>) {
    val  delegates=Delegates()
    println(delegates.hello)
    println(delegates.hello2)
    println(delegates.hello3)
    delegates.hello3="value of hello3"
    println(delegates.hello3)

}
