package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 * 使用FileInputStream文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("hellofos.txt");
//            int d;
//            while((d=fis.read())!=-1){
//                System.out.print((char)d);
//            }
            byte[] data = new byte[1024];
            int len = fis.read(data);
            String str = new String(data,"utf-8");//解决乱码问题
            //关闭输入流fis
            fis.close();
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
