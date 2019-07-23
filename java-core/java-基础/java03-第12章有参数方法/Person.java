import java.util.Scanner;

public class Person {
    /*练习1：定义一个方法接受一个整数，在方法体重判断这个数是不是偶数，如果是
    偶数输出这个数是偶数，如果是奇数就输出这个数是奇数*/
    public void 判断奇偶数(int num) {//形参--形式参数
        if(num%2==0) {
            System.out.println(num+"是偶数");
        }else{
            System.out.println(num+"是奇数");
        }
        //类中方法可以相互直接调用，不需要对象
       System.out.println(query("貂蝉"));
    }
    /*练习2：定义一个方法接受一个字符串，在方法中判断这个字符串是否在arr = {"
王昭君","西施","杨玉环","貂蝉"}这个数组中，如果在数组中，那么返回 你找的
人是四大美人，否则返回 你找的人不是四大美人。*/
    public String query(String name) {
        String[] arr = {"王昭君","西施","杨玉环","貂蝉"};
        String result = "";
        int i=0;
        for(;i<arr.length;i++) {
            if(arr[i].equals(name)) {
                result = name+"是四大美人！";
                break;//结束循环
            }
        }
        if(i==arr.length) {
            result = name+"不是四大美人！！";
        }
        return result;
    }
   //    练习3：定义一个计算器类，在类中定义一个传入3个整数的方法
    //，在方法中，对这3个整数求最大值，并输出最大值。
    public void calcMax(int a,int b,int c) {
        int max = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println(a+","+b+","+c+",最大值为："+max);
    }
    
//    练习4：再定义一个方法传入一个大于0整数n，表示学生的人数，
    //然后循环输入n个同学的成绩，输出总分，然后返回平均分。
    public double calcAvg(int n ) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[n];
        double sum = 0;//保存总分
        for(int i=0;i<scores.length;i++) {
            //提示
            System.out.print("请输入第"+(i+1)+"位学员成绩：");
            scores[i]=input.nextDouble();
            sum+=scores[i];
        }
        //返回平局分
        return sum/n;
    }
    
    
}
