package work;

/**
 * 1.2、需求说明 编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡。
 */

public class Work2 {
	Customer[] array = new Customer[3];
	int count = 0;
	public void addCustomer(Customer customer) {
		boolean flag = false;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]==null) {
				array[i]=customer;
				flag = true;
				count++;
				break;
			}
		}
		if (!flag) {
			System.out.println("人数已满!!");
		}
	
	}
	public void show() {
		System.out.println("客户信息：");
		System.out.println("姓名\t"+"年龄\t"+"是否办卡");
		for (int j = 0; j < count; j++) {
			System.out.println(array[j]);
	
}
	}
	public static void main(String[] args) {
		Customer customer = new Customer();
		Customer customer2 = new Customer();
		customer.name = "二狗子";
		customer.age = 20;
		customer.card = false;
		
		customer2.name = "陈三狗";
		customer2.age = 22;
		customer2.card = true;
		
		Work2 work2 = new Work2();
		work2.addCustomer(customer);
		work2.addCustomer(customer2);
		work2.show();
	}

}
