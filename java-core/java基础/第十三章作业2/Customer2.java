package 第十三章作业2;

import java.util.Scanner;

/*1.2、需求说明
编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡。*/
public class Customer2 {
	String name;
	int age;
	String vipCard;
	
	public void addCustomer(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入姓名：");
		name=input.next();
		System.out.print("请输入年龄：");
		age=input.nextInt();
		System.out.print("是否有会员卡：");
		vipCard=input.next();
	}
	
	@Override
	public String toString() {
		return name + "\t" + age + "\t" + vipCard + "\t";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("客户信息：");
		Customer2 c1=new Customer2();
		c1.addCustomer();
		Customer2 c2=new Customer2();
		c2.addCustomer();
		System.out.println();
		System.out.println(c1);
		System.out.println(c2);
	}

}
