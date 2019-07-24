package chapter13;

import java.util.Scanner;


public class StudentBiz {
	public static void main(String[] args) {
		Student stu=new Student();
		Scanner input=new Scanner(System.in);
		System.out.print("请输入Java的成绩：");
		double a =input.nextDouble();
		stu.JavaScore=a;
		System.out.print("请输入C的成绩：");
		double b =input.nextDouble();
		stu.CScore=b;
		System.out.print("请输入SQL的成绩：");
		double c =input.nextDouble();
		stu.SQLScore=c;
		StudentBiz studentBiz=new StudentBiz();
		stu= studentBiz.getAvg(stu);
		System.out.println("平均分为："+stu.Avg);
	}
	public Student getAvg(Student stu){
		stu.Avg=(stu.CScore+stu.JavaScore+stu.SQLScore)/3;
		return stu; 
	}
}
