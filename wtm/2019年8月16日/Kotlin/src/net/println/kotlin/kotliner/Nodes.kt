package net.println.kotlin.kotliner
fun html(block:Tag.()->Unit):Tag{
    return  Tag("html").apply{block(this)}
}

fun Tag.head(block:Head.()->Unit){
      this@head + Head().apply(block)
}
fun Tag.body(block:Body.()->Unit){
      this@body + Body().apply{block(this)}
}
class StringNode(val content:String):Node{
    override fun render(): String {
        return content
    }
}
class Head:Tag("head")
class Body:Tag("body"){
    var id by MapDelegate(proerties)
    var clas by MapDelegate(proerties)
}