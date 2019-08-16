package file;

import java.io.File;

public class Demo01 {

    public static void main(String[] agrs){
        File file = new File("./demo");

        //到硬盘上(外存上)创建一个文件夹如果创建成功,返回true
        // 创建失败返回false, 如已经存在文件夹时候
        boolean b = file.mkdir();
        System.out.println(b);

        //调用方法 createNewFile 创建文件
        //如果返回true表示创建成功,false失败
        File file2 = new File("./demo/hello.txt");
        try{
            boolean b1 = file2.createNewFile();
            System.out.println(b1);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
