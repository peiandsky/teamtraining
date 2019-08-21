// 方法名 int类型a，int类型b  返回值类型
    fun maxo(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
//把if当表达式
    //  方法名  int类型a，int类型b  if判断
    fun max(a:Int,b: Int)=if(a>b)a else b
fun main(args: Array<String>) {
    //使用在字符串中调用方法
    println("在字符串中调用方法  ${maxo(5, 10)}")
    //直接调用方法
    println("调用方法   "+maxo(8,5))
    //调用if表达式
    println("if表达式  "+max(9,5))
    //调用if表达式在字符串中
    println("if表达式在字符串中  ${max(5,1)}")
}