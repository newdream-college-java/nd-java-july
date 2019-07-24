package job02.text2;

public class Customer {
	String name;
	int age;
	boolean flag;
	public void show(Customer cus) {
		System.out.println("客户信息：");
		addcus(cus);
		System.out.println(name+"\t"+age+"\t"+flag);
	}
	public Customer addcus(Customer cus) {
		return cus;
	}
}
