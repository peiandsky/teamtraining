import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 公司：赛安服
 * 文件名：java_Demo
 *
 * @author（作者）：Administratora
 * @time（时间）：2019/8/21 11:25
 * 描述：
 * @version（版本）：
 */


public class java_Demo {
    Set set = new HashSet();
    Map<String, String> map = new HashMap();

    public static void main(String[] args) {
        java_Demo demo = new java_Demo();
        demo.map.put("1", "2");
        System.out.println(demo.map);
        demo.set.add(1);
        demo.set.add(1);
        demo.set.add(1);
        System.out.println(demo.set);

        Parent parent=new Child();
        System.out.println(((Child)parent).getName());
        if(parent instanceof  Child){
            System.out.println(((Child) parent).getName());
        }

    }


}
