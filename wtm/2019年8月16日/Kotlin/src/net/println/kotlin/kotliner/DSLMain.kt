package net.println.kotlin.kotliner

fun main() {
    Tag("html").apply {
        proerties["id"]="htmlid"
        children.add(Tag("head"))
    }.render().let (::println)
    html{
        "id"("Htmlid")
        "head"{
            "id"("headid")
        }
        body{
            id="bodyid"
            clas="bodyClass"
            "a"{
                "href"("www.baidu.com")
                +"百度一下"
            }
        }
//        proerties["id"]="htmlid"
//        children.add(Tag("head"))
    }.render().let (::println)
}
