package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 */
public class OISDemo {
    public static void main(String[] args) throws Exception{
        //从person.obj文件中反序列化java对象
        FileInputStream fis
                = new FileInputStream("person.obj");

        ObjectInputStream ois
                = new ObjectInputStream(fis);

        Person p = (Person)ois.readObject();

        System.out.println(p);

        ois.close();
    }
}
