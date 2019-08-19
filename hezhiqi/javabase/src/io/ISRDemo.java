package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 */
public class ISRDemo {
    public static void main(String[] args) throws Exception {
        //转韩流InputStreamReader练习
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        int d = -1;
        while( (d = isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }
}
