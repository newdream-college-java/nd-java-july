package ��ʮ������ҵ2;

import java.util.Scanner;

/*1.3.2����ѧ����ĩѧԱ���μ��� 3 �ſεĿ��ԣ��� Java��C��SQL����д��������
ÿλѧԱ 3 �ſε�ƽ����
��ʾ:���� Student �࣬��� 3 �ſεĳɼ�����;���� StudentBiz �࣬���� getAvg() 
public Students getAvg(Student stu){ }*/
public class StudentBiz {
	public Students getAvg(Students stu){ 
		stu.avg=(stu.Java+stu.C+stu.SQL)/3;
		return stu;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Students student=new Students();
		System.out.print("������ѧ����java�ɼ���");
		student.Java=input.nextDouble();
		System.out.print("������ѧ����C���Գɼ���");
		student.C=input.nextDouble();
		System.out.print("������ѧ����SQL�ɼ���");
		student.SQL=input.nextDouble();
		StudentBiz sBiz=new StudentBiz();
		System.out.println("ѧ���ɼ�ƽ����Ϊ��"+sBiz.getAvg(student).avg);
	}

}
