package warp;

public class Demo01 {

    public static void main(String[] agrs){

    /*
             包装类 warp clas *
             * 1. 将基本类型数据包装为对象
             * 2. 基本类型不是对象, 利用包装类将基本
             *    类型转换为对象,可以将基本类型作为
             *    对象管理.
             * 3. java 为了性能, 设计了基本类型.
             *    为了将基本类型转换为对象设计了包装类
     */
            Integer num = new Integer(99);
            //将num转换成double类型
            double d = num.doubleValue();//99.0
            System.out.println(d);
            //将num中包装的数据取出来赋值到k
            int i = num.intValue();//99
            System.out.println(i);

            Double num1 = new Double(57.5);
            int i1 = num1.intValue();//将i1中的数据转换为int值
            System.out.println(i1);//57

    }
}
