package work;

/**
 * 1.2������˵�� ���ʵ����ӿͻ����ͻ���Ϣ����:���������䡢�Ƿ��л�Ա����
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
			System.out.println("��������!!");
		}
	
	}
	public void show() {
		System.out.println("�ͻ���Ϣ��");
		System.out.println("����\t"+"����\t"+"�Ƿ�쿨");
		for (int j = 0; j < count; j++) {
			System.out.println(array[j]);
	
}
	}
	public static void main(String[] args) {
		Customer customer = new Customer();
		Customer customer2 = new Customer();
		customer.name = "������";
		customer.age = 20;
		customer.card = false;
		
		customer2.name = "������";
		customer2.age = 22;
		customer2.card = true;
		
		Work2 work2 = new Work2();
		work2.addCustomer(customer);
		work2.addCustomer(customer2);
		work2.show();
	}

}
