package ��11����ҵ;
/*1.7����дһ�� Student �࣬���а���(������ѧ�ţ��༶���Ա����䣬��ͥסַ)��
������һ �� sayHello()���������ѧ����Ϣ*/
public class Student {
	String name;
	int classNum;
	String banJi;
	String sex;
	int age;
	String addreas;
	
	public String sayHellow(){
		return "����:"+name+"\nѧ��:"+classNum+"\n�༶:"+banJi+"\n�Ա�:"+sex+"\n����:"+age+"\n��ͥסַ:"+addreas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.name="����";
		stu.classNum=12345;
		stu.banJi="java3��";
		stu.sex="��";
		stu.age=22;
		stu.addreas="���ϳ�ɳ";
		System.out.println(stu.sayHellow());		
	}

}
