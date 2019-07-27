package chapter12_2;
/*
 * 编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡。
 * */
public class Customer {
	String name;
	String age;
	String vip;
	Customer[] custs = new Customer[5];
	int count = 0;
	boolean flag = false;
	
	public void add(Customer cust){
		int i = 0;
		for (; i < custs.length; i++) {
			if (custs[i] == null) {
				flag = true;
				count++;
				custs[i] = cust;
				break;
			}
		}
		if (!flag) {
			System.out.println("数组已满！！！");
			return;
		}
		System.out.println(custs[i].name+"  "+custs[i].age+"  "+custs[i].vip);
	}
}
