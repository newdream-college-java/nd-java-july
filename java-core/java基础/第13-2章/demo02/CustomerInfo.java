/*���ʵ����ӿͻ����ͻ���Ϣ����:���������䡢�Ƿ��л�Ա����*/
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
				System.out.println("��ӳɹ�");
				break;
			}
		}
		if(!s){
			System.out.println("�������������ʧ��");
			return;
		}
	}
	public void show(){
		for (int i = 0; i < count; i++) {
			System.out.println(customer[i].toString());
		}
	}
}
