package 有参数方法第2次课;

public class Class {
    
    //String name;
    //String[] names;
    /*定义了一个学生变量(座位)，只能装一个学生(座)*/
    Student stu ;
    /*定义一个学生变量，同时创建了一个学生，将学生放入变量中*/
    Student stu1 = new Student();
    /*声明了一个学生数组，可以装很多个学生*/
    Student[] stus;
    /*定义了一个学生数组，可以装5个学生，此时还没有任何学生对象
     * 相当于：
     * 
     * Student stus;
     * Student stus;
     * Student stus;
     * Student stus;
     * Student stus;
     * 
     * 
     * int a ;
     * int b;
     * int c;
     * ===》int[] arr = new int[3];
     * 
     * */
    Student[] stus2= new Student[3];/*班级学生最大容积*/
    int count =0;// 实际班级的学生的个数
    /**
     * 添加学生的方法:对象作为参数
     * 1、对象作为方法的参数定义时：类名 对象名
     * 2、对象作为参数调用时：
     *          第1步：new 出对象，初始化(给属性赋值)
     *          第2步：调用对象作为参数的方法，传入对象名
     * 3、对象数组中元素的默认值  null 所有引用类型的默认值都为null
     * */
    
    public void addStudent(Student stu) {
        
//        Student s = new Student();
//        Student s1 = new Student();
        //关键：保存到班级中？？stus数组中
        boolean flag = false;
        //1.找到空座位
        for (int i = 0; i < stus2.length; i++) {
            if(stus2[i]==null) {//找到空座位
                flag = true;
                stus2[i]=stu;
                count++;
                break;
            }
        }
        if(!flag) {
            System.out.println("数组已满.....");
            return;//使用return 的结束方法的作用
        }
        System.out.println(stu.no+"\t"+stu.name+"\t"+stu.score+"\t"+stu.age);
    }
    /**
     * 统计班级平局分的方法
     */
    public void calcAvg() {
        if(count==0) {
            System.out.println("亲，请先添加学生，然后再计算平局分！！");
            return;//结束方法
        }
        
        //1.拿到学生 （班级的所有学生在哪里？）
        double sum= 0;//学生总分
        for (int i = 0; i < stus2.length; i++) {
            //座位上有学生的的成绩
            if(stus2[i]!=null) {
                sum+=stus2[i].score;
            }
            
        }
        //2.统计学生的成绩
        //System.out.println(sum/stus2.length);//有bug
       System.out.println("平局分："+sum/count);
        
    }
    /**
     * 删除学生方案:根据名字删除  或者根据学号删除 推荐学号删除,学号唯一。
     * ["11 二狗"，" 20 旺财 " ，"21  来福"] ["11 二狗"，" 20 旺财 " ，null] 
     * 删除学号20的学生
     * 1.找到学生并删除学生 。["11 二狗"，null ，"21  来福"]  ["11 二狗"，null ，null]
     * 2.移动学生(交换，后面覆盖前面)["11 二狗"，"21  来福",null] 
     */
    public void 删除学生信息(int no ) {
        boolean flag =false;
        int i = 0;
        for (; i < stus2.length; i++) {
            if(stus2[i]!=null&&stus2[i].no==no) {
                flag = true;
                stus2[i]=null;//删除学生
                System.out.println("删除学员成功！！");
                break;
            }
        }
        if(!flag) {
            System.out.println("删除失败");
            return;
        }
        //移动学生
        Student tmp = null;
       
        for(int j=i;j<stus2.length-1;j++) {
            if(stus2[j+1]==null) {
                break;
            }
            tmp = stus2[j];
            stus2[j]=stus2[j+1];
            stus2[j+1]=tmp;
        }
        
    }
    
    /**
     * 修改学生的名字的方法
     */
    public void 修改学生信息(int xh,String name) {
        boolean flag = false;
        for (int i = 0; i < stus2.length; i++) {
            if(stus2[i]!=null&&stus2[i].no==xh) {
                flag = true;
                stus2[i].name=name;
                System.out.println("修改姓名成功");
                break;
            }
        }
        if(!flag) {
            System.out.println("工号错误,修改失败！！！");
        }
    }
    
    /**
     * 查询所有学生的方法
     */
    public void showStus() {
        for (int i = 0; i < stus2.length; i++) {
            if(stus2[i]!=null) {
                System.out.println(stus2[i]);
            }
        }
    }
    
    
    
    
    
}
