package chapter12;

import java.util.Scanner;

/*
	修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功
*/

public class Student {
	Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] name=new String[5];
		for (int i = 0; i < name.length; i++) {
			System.out.print("请输入学生姓名：");
			String a=input.next();
			name[i]=a;
			}
		
		System.out.println("************************\n");
		System.out.println("\t学生姓名列表:");
		System.out.println("************************\n");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		Student student=new Student();
		//调用修改学生的方法
		student.upDate(name);
		System.out.println("************************\n");
		System.out.println("\t学生姓名列表:");
		System.out.println("************************\n");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		
	}
	
	public void upDate(String[] name) {
		System.out.print("\n请输入要修改的学生姓名：");
		String a=input.next();
		//标记法，能够得知数组中是否有该学生
		boolean flag=false;
		for (int i = 0; i < name.length; i++) {
			if(a.equals(name[i])){
				System.out.print("请输入新的学生姓名：");
				String b=input.next();
				flag=true;
				name[i]=b;
			}
		}
		if(!flag){
			System.out.println("没有该学生！！");
			return;
		}
		System.out.println("*****修改结果*****");
		System.out.println("找到并修改成功！");
	}

}
