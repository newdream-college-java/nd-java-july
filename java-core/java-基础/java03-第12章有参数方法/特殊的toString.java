
public class 特殊的toString {
    String name;
    int age;
    //特殊方法：toString   
    //1.这个方法一般定义为返回值值类型为String的方法
    //2.输出对象的属性值(自我介绍)
    public String toString() {
        return name+"\t"+age;
    }
}
