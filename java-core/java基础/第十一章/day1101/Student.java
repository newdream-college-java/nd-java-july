package Work;

/**
 * 1.7����дһ�� Student �࣬���а���(������ѧ�ţ��༶���Ա����䣬��ͥסַ)��
	������һ �� sayHello()���������ѧ����Ϣ
 */
public class Student {
	String name = "�¶���";
	int ID =25;
	String class1 = "java 03��";
	String sex = "��";
	int age = 22;
	String address = "���ϳ�ɳ����С��66��";
	public void syaHello() {
		System.out.println("������"+name+"\nѧ�ţ�"+ID+"\n�༶��"+class1+"\n�Ա�"+sex+"\n���䣺"+age+"\n��ͥסַ��"+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.syaHello();
	}

}
