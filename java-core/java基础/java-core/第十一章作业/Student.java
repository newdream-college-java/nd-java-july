package chapter_11;

public class Student {
	String names;
	String num;
	String classes;
	String sex;
	int age;
	String address;
	
	public void sayHello(){
		System.out.println("ѧ��������"+names+"\tѧ�ţ�"+num+"\t�༶��"+"\t�Ա�"+"\t���䣺"+age+"\t��ͥסַ��"+address);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.names="������";
		stu.num="35";
		stu.classes="Java3��";
		stu.sex="18";
		stu.address="����С��66��";
		stu.sayHello();

	}

}
