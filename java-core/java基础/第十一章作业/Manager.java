package ��11����ҵ;
/*
 * 1.1������˵��
��д����Ա Manager��ʹ�� show()�������ع���Ա��Ϣ(ʹ�� return ���ʵ����Ϣ
�ķ���)
*/
public class Manager {
	String name;
	String password;

	public String show() {
		return "����Ա��Ϣ�û���Ϊ��"+name+"\t"+"����Ϊ:"+password;
	}
	
	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.name="����";
		m1.password="1234";
		System.out.println(m1.show());
	}
}
