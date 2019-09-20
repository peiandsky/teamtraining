package net.println.kotlin.chapter5.tailrecursive

/**
 * 尾递归优化 tailrec
 */
data class ListNode(val value:Int,var next:ListNode?=null)

tailrec fun findListNode(head:ListNode?,value: Int):ListNode?{
    head?:return  null
    if(head.value==value)return head
    return  findListNode(head.next,value)
}
//自定义阶乘
fun factorial(n:Long):Long{
    if(n<1)return 1
    return n* factorial(n-1)
}
data class TreeNode(val value: Int){
    var left:TreeNode?=null
    var right:TreeNode?=null
}
fun findTreeNode(root:TreeNode?,value: Int):TreeNode?{
    root?:return null
    if(root.value==value)return root
    return  findTreeNode(root.left,value)?:return findTreeNode(root.right,value)
}
fun main() {
    val MAX_NOOE_COUNT:Long=10000
    println(factorial(MAX_NOOE_COUNT))
    val head=ListNode(0)
    var p=head
    for(i in 1..MAX_NOOE_COUNT){
        p.next= ListNode(i.toInt())
        p=p.next!!
    }
    println(findListNode(head,MAX_NOOE_COUNT.toInt()-3)?.value)
}