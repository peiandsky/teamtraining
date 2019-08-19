package keyboard;

import java.util.ArrayList;
import java.util.Date;

public class Demo01 {

    public static void main(String[] args) {
        //输入sout，按下enter键，生成System.out.println()方法.
        System.out.println("输入sout，按下enter键，快速生成System.out.println()");

        //输入fori，按下enter键，生成for循环.
        for (int i = 0; i < 2; i++) {

        }

        //输入iter，按下enter键，生成foreach循环.
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(10);
        for (Integer num : list) {
            System.out.println(num);
        }

        //alt+enter 提示导包
        Date date = new Date();

        //第二次按alt+enter会为我们自动添加类型并生成变量名
        Date date1 = new Date();


    }
}
