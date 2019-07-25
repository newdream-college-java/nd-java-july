package demo04;

import java.util.Scanner;

public class StudentBizTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Student student=new Student();
		System.out.print("请输入java成绩：");
		student.javaSocre=input.nextDouble();
		System.out.print("请输入c成绩：");
		student.cScore=input.nextDouble();
		System.out.print("请输入sql成绩：");
		student.sqlScore=input.nextDouble();
		StudentBiz biz=new StudentBiz();
		biz.getAvg(student);
	}
	
}
