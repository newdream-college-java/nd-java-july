/*编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡。*/
package demo02;

public class CustomerInfo {
	int count=0;
	Customer [] customer=new Customer[3];
	public void addCustomer(Customer cus){
		boolean s=false;
		for (int i = 0; i < customer.length; i++) {
			if(customer[i]==null){
				count++;
				s=true;
				customer[i]=cus;
				System.out.println("添加成功");
				break;
			}
		}
		if(!s){
			System.out.println("人数已满，添加失败");
			return;
		}
	}
	public void show(){
		for (int i = 0; i < count; i++) {
			System.out.println(customer[i].toString());
		}
	}
}
