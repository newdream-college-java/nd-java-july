package 有参数方法第2次课;

import java.util.Scanner;

public class TestTeacher {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //1.得到老师对象
        Teacher t = new Teacher();
        //2.调用对象的方法
        //double[] arr = new double[] {3.4,5.5};
        //方式二：
        t.calcScore(new double[] {3.4,5.5});
        //方式一：
        double[] arr = {3.4,5.5};
        t.calcScore(arr);//实参只需要传入数组名
        //方式三：数组的值是输入的
        System.out.println("请输入学生的数量：");
        int number = input.nextInt();
        double[] brr = new double[number];
        System.out.println("请输入"+number+"位同学成绩：");
        for (int i = 0; i < brr.length; i++) {
            brr[i] =input.nextDouble();
        }
        //调用方法
        t.calcScore(brr);//调用传入数组名就可以了
    }
}
