//测试类---才能被运行(才能被java )
public class Demo02 {
    //main ------>java程序的入口
    public static void main(String[] args) {
        //通过类(模子)构造一个对象(煤球)
        //与Scanner input =new Scanner(System.in);类似
        狗类 dog1 = new 狗类();//一条狗出生了
        //取名字
        dog1.姓名="二狗子";
        dog1.颜色="白色";
        dog1.品种="阿富汗";
        
        
        dog1.品种="哈巴头";//覆盖原来属性值
        //查看这个狗对象是否保存到电脑：输出这条狗的属性值
        System.out.println("名字"+dog1.姓名+"，颜色为："+dog1.颜色+"，品种为："+dog1.品种);
        
        
        
        System.out.println(dog1);
      //  System.out.println(姓名);
        
        
        //调用方法语法：对象名. 方法名();   调用方法：执行方法中的代码   
        dog1.show();
      
        
        
        
        //2)通过狗类再构造一个对象
        狗类 dog2 = new 狗类();
        //属性是有默认值的(与数组一样)
        
        dog2.show();
        
        System.out.println(dog2.品种+"\t"+dog2.姓名+"\t"+dog2.颜色);
        
           //3)创建一个没有引用的对象  匿名对象创建完之后不能进行访问属性和方法的。
        //new 狗类();//匿名对象
        
        System.out.println(new 狗类().品种);
        System.out.println( new 狗类());
        
        
        
//        String name= "二狗子";
//         String 颜色="白色";
//         String 品种="阿富汗"; 封装到一个对象上
                
    }

}
