
public class Person {
	public void show(String name,int age,String sex){
		System.out.println("---------------��Ա��Ϣ-------------");
		System.out.println("��Ա��Ϣ���£�");
		System.out.println("����--->"+name);
		System.out.println("����--->"+age);
		System.out.println("�Ա�--->"+sex);
	}
	public static void main(String[] args) {
		Person p1=new Person();
		p1.show("����", 36, "��");
	}
}
