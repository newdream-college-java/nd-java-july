/**
 * ���� Person ��ʹ��������췽���������ֱ����������Ա����
 *		ʹ�ô������Ĺ���ʵ��������
 *		��ʾ��Ա��Ϣ(����ͼ)
 * @author 54975
 *
 */
public class Person {
	String name;
	String sex;
	int age;
	public void show(Person s){
		System.out.println("-----------------��Ա��Ϣ-------------");
		System.out.println("��Ա��Ϣ����:");
		System.out.print("����--->"+s.name+"\n�Ա�--->"+s.sex+"\n����--->"+s.age);
	}
	public static void main(String[] args) {
		Person s=new Person();
		s.name="����";
		s.sex="��";
		s.age=20;
		s.show(s);
	}
}
