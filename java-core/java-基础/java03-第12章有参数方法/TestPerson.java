import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        //1.创建Person对象
        Person p = new Person();
        //2.调用方法----本质就是执行一次方法体
        //方式一：对象名.方法名(值)  有返回值
      //  p.query("貂蝉2");//有返回值  ，得不到返回值 没有错
//        System.out.println(  p.query("貂蝉2"));
//        Scanner input = new Scanner(System.in);//ctrl+shift+o
//        //提示
//        System.out.println("请输入一 个整数：");
//        int num = input.nextInt();
//        p.判断奇偶数(num);//无返回
        
        //方式二：类中调用 
        //p.判断奇偶数(9);//实参  -------实际参数
        
        System.out.println("==========第3题，第4题调用======");
        
        //第3题调用
        p.calcMax(3, 4, 5);
        //第4题调用
        System.out.println("平局分为："+p.calcAvg(3));
        
        
        
        
    }
}
