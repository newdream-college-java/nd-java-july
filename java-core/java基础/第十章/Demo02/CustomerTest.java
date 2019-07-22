package Demo02;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer1=new Customer();
		customer1.cardType="½ð¿¨";
		customer1.integral=1100;
		Customer customer2=new Customer();
		customer2.cardType="ÆÕ¿¨";
		customer2.integral=5200;
		Customer customer3=new Customer();
		customer3.cardType="ÆÕ¿¨";
		customer3.integral=1100;
		customer1.show();
		customer2.show();
		customer3.show();
	}

}
