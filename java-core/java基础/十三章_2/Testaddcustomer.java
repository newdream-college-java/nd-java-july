package 十三章_2;

public class Testaddcustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer test1 = new Customer();
		Customer test2 = new Customer();
		test1.addCustomer("王一", 30, false);
		test2.addCustomer("郝强", 19, true);
		System.out.println("客户信息：");
		System.out.println(test1);
		System.out.println(test2);

	}

}
