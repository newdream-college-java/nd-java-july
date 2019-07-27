package chapter12_2;

public class TestCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer();
		cust1.name = "王一";
		cust1.age = "18";
		cust1.vip = "false";
		cust1.add(cust1);
		
		Customer cust2 = new Customer();
		cust2.name = "王二";
		cust2.age = "28";
		cust2.vip = "ture";
		cust2.add(cust2);
	}

}
