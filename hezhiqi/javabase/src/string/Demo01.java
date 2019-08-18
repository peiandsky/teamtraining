package string;

public class Demo01 {
    public static void main(String[] agrs){
        String str = "hello idea";

        //使用 length() 可以返回字符个数
        int len = str.length();
        System.out.println(len);

        //使用 charAt(索引号) 返回指定位置字符
        char cha = str.charAt(1);
        System.out.println(cha);

        //indexOf 方法 从前向后查找指定的字符串、字符找到就返回位置，找不到返回-1
        int index = str.indexOf("d");
        System.out.println(index);

        //截取子字符串 substring 截取字符串的一部分作为新的字符串
        String str1  = str.substring(2,4);//含头不含尾
        System.out.println(str1);
        String str2 = str.substring(6);//从起始位置开始到字符串最后
        System.out.println(str2);

        //trim()去除字符串两端的空白
        String name = "  hezhiqi ";
        String name1 = name.trim();
        System.out.println(name);
        System.out.println(name1);

        //检查字符串是否已指定后缀为结尾
        String s = "hell.mp3";
        boolean b = s.endsWith(".mp3");
        System.out.println(b);
        boolean b1 =s.endsWith(".mp4");
        System.out.println(b1);
    }

}
