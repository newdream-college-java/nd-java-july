package demo02;


public class CustomerTest {
	public static void main(String[] args) {
		CustomerInfo customerInfo=new CustomerInfo();
		Customer cu1=new Customer();
		cu1.name="��һ";
		cu1.age=20;
		cu1.judgemembers=false;
		
		Customer cu2=new Customer();
		cu2.name="�Ŷ�";
		cu2.age=22;
		cu2.judgemembers=false;
		
		Customer cu3=new Customer();
		cu3.name="����";
		cu3.age=20;
		cu3.judgemembers=true;
		
		Customer cu4=new Customer();
		cu4.name="����";
		cu4.age=22;
		cu4.judgemembers=true;
		
	    customerInfo.addCustomer(cu1);
		customerInfo.show();
		
		customerInfo.addCustomer(cu2);
		customerInfo.show();
		
		customerInfo.addCustomer(cu3);
		customerInfo.show();
		
		customerInfo.addCustomer(cu4);
		customerInfo.show();
		
		
		
	}
}
