package work;
/**
 *1.2������˵��
		���� Person ��ʹ��������췽���������ֱ����������Ա������
		ʹ�ô������Ĺ���ʵ����������ʾ��Ա��Ϣ
 */

public class Person {
	public void persons(String name,String sex,int age) {
		System.out.println("��Ա��Ϣ���£�");
		System.out.println("����-->"+name+"\n�Ա�-->"+sex+"\n����-->"+age);
	}
	public static void main(String[] args) {
		Person person = new Person();
		person.persons("�����", "��", 46);
		
	}

}
