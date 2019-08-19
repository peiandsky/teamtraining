package io;

import java.io.FileOutputStream;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/18
 * @Description: io
 * @version: 1.0
 * FileOutputStream文件输出流相关练习
 */

public class FOSDemo {
    public static void main(String[] args) throws Exception {
        /**
         * 对hellofos.txt文件写操作
         *
         * 构造方法:
         * FileOutputStream(String path)
         * FileOutputStream(File file)
         * 以上两种创建方式创建的文件输出流是覆盖
         * 写操作,即:若指定的文件已经存在,会先将
         * 该文件数据删除.然后通过当前流写出的内容
         * 做为该文件数据保存.
         *
         * 如果在构造方法中再传入第二个参数,是一个boolean
         * 值,该值为true时,文件输出流为追加模式.即:原有数据
         * 都保留,通过当前流写出的内容会被追加到文件后面.
         *
         * 文件输出流不支持修改文件部分数据的操作.比如之前
         * 用RAF做的修改用户昵称操作,文件流做不到.
         */

          /*该方式创建的文件输出流是覆盖
          写操作,即:若指定的文件已经存在,会先将
          该文件数据删除.然后通过当前流写出的内容
          做为该文件数据保存*/
        FileOutputStream fos = new FileOutputStream("hellofos.txt");
        String str = "欢迎使用文件输出流1";
        byte[] data = str.getBytes();
        fos.write(data);
        str = "欢迎使用文件输出流2";
        data = str.getBytes();
        fos.write(data);
        System.out.println("写出完毕");
        fos.close();


        //该方式不会覆盖之前文件的内容，会将写出的数据追加到后面
//        FileOutputStream fos1 = new FileOutputStream("hellofos1.txt",true);
//        String str1 = new String("222欢迎使用文件输出流");
//        byte[] data1 = str1.getBytes();
//        fos1.write(data1);
//        System.out.println("写出完毕");
//        fos1.close();

    }


}




