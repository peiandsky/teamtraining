//when表达式
fun  describe(obj:Any):String=
        when(obj){
            //如果输入的值==1  则输出“One”
            1           ->"One"
            //如果输入的值=="Hello"   则输出"Greeting"
            "Hello"     ->"Greeting"
             //如果输入的值是Long类型   则输出"long"
            is Long     ->"long"
              //如果输入的值不是String类型   则输出"Not a Sting"
            !is String  ->"Not a Sting"
            //如果以上都不满足      则输出"Unknown"
            else        ->"Unknown"
        }

fun main(args: Array<String>) {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}