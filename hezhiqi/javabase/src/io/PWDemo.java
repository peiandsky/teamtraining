package io;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 块写文本数据,加快写出效率
 *
 * 具有自动行刷新的缓冲字符输出流:
 * java.io.PrintWriter
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw
                = new PrintWriter("pw.txt","UTF-8");
        pw.println("我可以带你去吃很多,很多好东西");
        pw.close();
        System.out.println("写入完毕");
    }

}
