package job02.text2;
//���ʵ����ӿͻ����ͻ���Ϣ����:���������䡢�Ƿ��л�Ա����
public class TextCus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1=new Customer();
		Customer cus2=new Customer();
		cus1.name="��һ";
		cus1.age=30;
		cus1.flag=false;
		cus1.show(cus1);
		cus2.name="��ǿ";
		cus2.age=19;
		cus2.flag=true;
		cus2.show(cus2);
	}

}
