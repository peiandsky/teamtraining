/**
 * 公司：赛安服
 * 文件名：JavaA
 *
 * @author（作者）：Administratora
 * @time（时间）：2019/8/27 14:30
 * 描述：
 * @version（版本）：
 */


package net.println.kotlin;

public class JavaA {
    private  int b=0;

    public int getB() {
        System.out.println("这是get方法");
        return b;
    }

    public void setB(int b) {
        System.out.println("这是set方法");
        this.b = b;
    }
}
