import java.util.HashMap

//使用值检查并自动转换
//Any中定义的方法有：toString(),equals().hashCode()
//Object类中定义的方法有：toString().equals().hashCode().getClass(),clone(),finalize().notify()
//notifyAll().wait(),wait(long),wait(long,int)11个
//方法名       Any类型的obj  返回值类型Int
fun getStringLength(obj: Any): Int? {
    //使用is操作符检查一个表达式是否是某个类型的实例。如果是对不可变的局部变量或者属性进行过了
    //类型检查，就没有必要明确转换
    if (obj is String) {
        //obj 将在这个分支中自动转换为String类型
        println("进入String类型")
        return obj.length
    }
    //obj 在种类检查外任然是Any类型
    return obj.hashCode()
}

fun main(args: Array<String>) {
    //int类型
    println(getStringLength(555))
    //String类型
    println(getStringLength("12138"))
    //不可变集合类型
    println("不可变集合类型")
    println(getStringLength(listOf(String())))
    println()
    //可以添加不同类型的元素
    println(getStringLength(listOf("4", 5, 6, "8")))
    println()
    println(getStringLength(listOf<Int>(12, 3)))
    println()
    println(getStringLength(listOf<String>("12", "3")))
    println()
    //数组类型
    //可以添加不同类型的元素
    println(getStringLength(arrayOf("1", 2, 3)))
    //可变集合
    //定义一个数组
    val arr = arrayOf("1", "2", 3, 4)
    val mutableList1 = mutableListOf("5", 4, 3, 2, 1)
    val mutableList2 = mutableListOf<String>("5", "4", "3", "2", "1")
    val mutableList3 = mutableListOf(arr)
    val mutableList: ArrayList<String>



    println(mutableList1)
    //为可变字符串添加元素，并且在末位添加
    mutableList1.add(6)
    println(mutableList1)
    //为可变字符串添加元素，在指定索引位置处添加
    mutableList1.add(1, 6)
    println(mutableList1)
    //删除某一个元素 从索引开始找到第一个并删除它
    mutableList1.remove(6)
    println(mutableList1)
    //删除指定索引位置的元素
    mutableList1.removeAt(0)
    println(mutableList1)
    //Set
    println("开始Set")
    //创建不可变集合
    val set1 = setOf(0, 1, 2, "3", "4", "5", 6, 7, 8)
    //创建可变mutableSet集合
    val mutableSet1 = mutableSetOf(0, 1, 2, "0", "2", "8", 1, 2, 8)
    //创建HashSet集合（可变）
    val mutable = hashSetOf<String>("1", "2", "3")
    mutable.add("1")
    mutable.add("4")
    println(mutable)
    val str = arrayOf<String>("好", "好", "学", "习")
    println(mutableSet1)
    //不可以重复 对可变集合添加元素
    mutableSet1.addAll(str)
    println(mutableSet1)
    println(set1)
    //对不可变数组 添加元素(失败没有对应的方法)

    //创建linkedHashSet集合（可变）
    var linkedHashSet = linkedSetOf<String>()
    linkedHashSet.add("1")
    linkedHashSet.add("2")
    println(linkedHashSet)
    //创建TreeSet集合（可变）
    var treeSet = sortedSetOf<String>()
    treeSet.add("1")
    treeSet.add("1")
    treeSet.add("2")
    println(treeSet)


}