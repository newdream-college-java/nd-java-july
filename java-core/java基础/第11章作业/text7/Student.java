package proJob11.text7;

import java.util.Scanner;

public class Student {
	String name;
	String number;
	String classString;
	String sex;
	int age;
	String address;
	
	
	public void sayHello() {
		inPut();
		System.out.println("姓名："+name);
		System.out.println("学号："+number);
		System.out.println("班级："+classString);
		System.out.println("性别："+sex);
		System.out.println("年龄："+age);
		System.out.println("家庭住址："+address);
	}
	
	public void inPut() {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入姓名：");
		name=input.next();
		System.out.print("请输入学号：");
		number=input.next();
		System.out.print("请输入班级：");
		classString=input.next();
		System.out.print("请输入性别：");
		sex=input.next();
		System.out.print("请输入年龄：");
		age=input.nextInt();
		System.out.print("请输入家庭住址：");
		address=input.next();
	}
	
}
