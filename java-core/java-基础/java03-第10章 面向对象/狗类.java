//自定义类
public class 狗类 {
    //相同属性列表    属性类型 属性名；(变量类型 变量名)
    String 姓名;
    String  颜色;
    String 品种;
    
    //相同方法列表---定义(方法模子造出来了，不会执行的)
    //姓名是是指谁的姓名？？？  谁调用这个方法  就是指的谁的姓名
    public void show() {
        System.out.println("狗的名字叫："+姓名+",颜色为："+颜色+",品种为："+品种);
    }
    
}
