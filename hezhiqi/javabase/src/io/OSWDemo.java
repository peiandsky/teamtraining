package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 */

public class OSWDemo {

    /**
     * 字符流
     * java将流按照读写单位划分为字节流与字符流
     * 所有字节流都继承:InputStream和OutputStream
     * 但是所有字符流都继承:Reader和Writer
     *
     * 字符流是以字符(char)为最小单位读写数据的,因此
     * 字符流仅适合读写文本类数据.
     * 字符流底层实际还是读写字节,只是字节与字符的转换
     * 由字符流自行完成.
     *
     * 转换流:
     * java.io.InputStreamReader
     * java.io.OutputStreamWriter
     * 常用的字符流实现类,在以字符流作为操作的流连接中
     * 起到非常重要的环节,但是通常不直接操作这套流.
     */
    public static void main(String[] args) {

        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream("osw.txt"),"utf-8");
            osw.write("使用字符流进行练");
            osw.close();
            System.out.println("写入完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
