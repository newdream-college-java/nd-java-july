package ��ʮ������ҵ1;

/*
 1.2������˵��
 ���� Person ��ʹ��������췽���������ֱ����������Ա������
ʹ�ô������Ĺ���ʵ��������
��ʾ��Ա��Ϣ
*/
public class Person {
	public String toString(String name,String sex,int age) {
		return "����-->"+name+"\n"+"�Ա�-->"+sex+"\n"+"����-->"+age;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------��Ա��Ϣ--------------------");
		System.out.println("��Ա��Ϣ���£�");
		Person person=new Person();
		String string=person.toString("����","��",23);
		System.out.println(string);
	}
}
