package job01.text3;

import java.util.Scanner;

public class Student {
	public void addStu(String[] arr) {
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入学生姓名：");
			arr[i]=input.next();
		}
		show(arr);
	}
	
	public void show(String[] arr) {
		System.out.println("****************************");
		System.out.println("学生姓名列表：");
		System.out.println("****************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	public void modi(String[] arr) {
		addStu(arr);
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要修改的学生姓名：");
		String name1=input.next();
		System.out.print("请输入新的学生姓名：");
		String name2=input.next();
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if(name1.equals(arr[i])) {
				flag=true;
				arr[i]=name2;
				break;
			}
		}
		if(!flag) {
			System.out.println("查无此人！");
			return;
		}
		
		System.out.println("**********修改结果**********");
		System.out.println("找到并修改成功！");
		show(arr);
		
	}
	
}
