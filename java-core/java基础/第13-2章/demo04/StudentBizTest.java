package demo04;

import java.util.Scanner;

public class StudentBizTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Student student=new Student();
		System.out.print("������java�ɼ���");
		student.javaSocre=input.nextDouble();
		System.out.print("������c�ɼ���");
		student.cScore=input.nextDouble();
		System.out.print("������sql�ɼ���");
		student.sqlScore=input.nextDouble();
		StudentBiz biz=new StudentBiz();
		biz.getAvg(student);
	}
	
}
