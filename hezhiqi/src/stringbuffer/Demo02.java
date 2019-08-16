package stringbuffer;

public class Demo02 {
    public static void main(String[] agrs){
        /*
        StringBuilder
        可变字符串，其方法可以修改StringBuilder中
        字符数组的内容。因为没有频繁复制新字符数组
        相对于String API其操作性能好
         */
        StringBuffer buf = new StringBuffer();
        buf.append("何志奇");
        buf.append("孙悟空");
        System.out.println(buf.toString());
    }
}
