package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 */
public class OOSDemo {
    public static void main(String[] args) throws Exception{
        String name = "何志奇";
        String age = "25";
        String gender = "男";

        Person p = new Person(name,age,gender);
        FileOutputStream fos
                = new FileOutputStream("person.obj");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);
        /*
         * 对象输出流写对象的方法:
         * void writeObject(Object obj)
         * 将给定对象按照其结构转换为一组字节后写出
         *
         * 涉及到的术语:
         * 当对象经过OOS写出时,其将该对象按照结构转换
         * 为了一组字节,这个过程称为"对象序列化"
         *
         * 当序列化的这组字节再经过FOS写入到文件中(写
         * 入到磁盘做长久保存)这个过程称为"数据持久化"
         *
         */
        oos.writeObject(p);
        System.out.println("写出完毕");
    }
}
