package net.println.kotlin.kotliner

import net.println.kotlin.chapter3.str
import java.awt.datatransfer.Clipboard
import java.lang.StringBuilder
import java.util.ArrayList

open class Tag(val name:String):Node{
    //子节点数组
    val children=ArrayList<Node>()
    //节点属性
    val proerties=HashMap<String,String>()

    operator fun String.invoke(value: String){
        //这个this就是字符串调用的字符串
        proerties[this]=value
    }
    operator fun String.invoke(block:Tag.()->Unit){
        children.add(Tag(this).apply(block))
    }
    operator fun String.unaryPlus(){
        children.add(StringNode(this))
    }
    operator fun plus(node:Node){
        children.add(node)
    }
    //<html id="htmlid" style=""> <head></head> <body></body> </html>
   //实现html标签的抽象方法
    override fun render(): String {
        return StringBuilder()
                .append("<")
                .append("$name ")
                .let{
                    stringBuilder ->
                    if(!this.proerties.isEmpty()){
                        stringBuilder.append("")
                        this.proerties.forEach{
                            stringBuilder.append(it.key)
                                    .append("=")
                                    .append("\"")
                                    .append(it.value)
                                    .append("\" ")
                        }
                    }
                    stringBuilder
                }
                .append(">")
                .let { 
                    stringBuilder ->
                    children.map(Node::render).map(stringBuilder::append)
                    stringBuilder
                }
                .append("</$name>")
                .toString()
    }

}
