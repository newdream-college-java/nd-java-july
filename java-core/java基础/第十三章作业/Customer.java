package chapter13;

/*
	编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡
*/

public class Customer {
	String 姓名;
	int 年龄;
	boolean 会员卡;
	public static void main(String[] args) {
		System.out.println("客户信息：");
		Customer customer1=new Customer();
		customer1.姓名="王一";
		customer1.年龄=30;
		customer1.会员卡=false;
		System.out.println(customer1);
		
		Customer customer2=new Customer();
		customer2.姓名="赫强";
		customer2.年龄=19;
		customer2.会员卡=true;
		System.out.println(customer2);

	}
	public String toString() {
		return 姓名+"\t"+年龄+"\t"+会员卡;
	}
}
