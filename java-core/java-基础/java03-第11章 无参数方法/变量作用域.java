
public class 变量作用域 {
    int name;//属性、成员变量、字段   全局变量
    public void add() {
        if(3>5) {
            int a;//局部变量
        }
        int a ;//局部变量(全局变量 相对来说)
        System.out.println(name);//全局变量
    }
    public void calc() {
       // System.out.println(a); //因为a是局部变量
        System.out.println(name);//全局变量
    }
    //方法的调用
    public void 方法1() {
        System.out.println("我是方法一");
        //方法1调用方法 :执行调用
        方法2();
    }
    public void 方法2() {
        System.out.println("我是方法二");
        //方法2调用方法3（有返回值）
        System.out.println(方法3());
        
    }
    public String 方法3() {
        方法1();
        return "我是方法三";
    }
    
}
