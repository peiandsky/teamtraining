package io;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 块读操作,并且可以按行读取字符串
 *
 */
public class BRDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("hellofos.txt")));
        String line = null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
