package 有参数方法第2次课;

public class TestStudent {
    public static void main(String[] args) {
        //1.对象
        Student s = new Student();
        Student s1 = new Student();
        //2.使用对象
        s.name="李二狗";
        s.age=19;
        s.no=11;
        s.score=99;
        
        s1.name="王旺财";
        s1.age=23;
        s1.no=20;
        s1.score=98;
        
        
        System.out.println(s+"\n"+s1);
    }
}
