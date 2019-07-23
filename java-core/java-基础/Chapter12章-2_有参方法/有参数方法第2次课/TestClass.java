package 有参数方法第2次课;

public class TestClass {
    public static void main(String[] args) {
        //1.对象
        Class j3 = new Class();
        
    
        //2.使用
        Student s = new Student();
        s.name="李二狗";
        s.age=19;
        s.no=11;
        s.score=99;
        //添加学生
        j3.addStudent(s);
        
        
        Student s1 = new Student();
        s1.name="王旺财";
        s1.age=23;
        s1.no=20;
        s1.score=98;
        //添加学生
        j3.addStudent(s1);
        
               
        Student s2 = new Student();
        s2.name="罗来福";
        s2.age=23;
        s2.no=21;
        s2.score=97;
        //添加学生
       j3.addStudent(s2);
        
        Student s3 = new Student();
        //添加学生
       // j3.addStudent(s3);
        
       // j3.calcAvg();
        //j3.删除学生信息(11);
        System.out.println("将21号学生名字改为  达文西");
        j3.修改学生信息(21, "达文西");
        
        //显示
        j3.showStus();
      
    }
}  
