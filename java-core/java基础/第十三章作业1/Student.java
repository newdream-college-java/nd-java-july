package ��ʮ������ҵ1;
/*1.3������˵��
�޸�ѧ�������������¡��������������޸Ĳ���ʾ�Ƿ��޸ĳɹ�
*/
import java.util.Scanner;


public class Student {
	//String[] name=new String[5];
	Scanner input = new Scanner(System.in);
	public void addStudent(String[] name) {
		for (int i = 0; i < name.length; i++) {
			System.out.print("������ͻ�������");
			name[i]=input.next(); 
		}
	}
	
	public void show(String[] name) {
		System.out.println("****************************************");
		System.out.println("\t\t�ͻ������б�");
		System.out.println("****************************************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		System.out.println();
	}
	public void updateStudent(String[] name) {
		System.out.print("������Ҫ�޸ĵĿͻ�������");
		String s1=input.next();
		boolean flag=false;
		for (int i = 0; i < name.length; i++) {
			if (s1.equals(name[i])) {
				flag=true;
				System.out.print("�������µĿͻ�������");
				String s2=input.next();
				name[i]=s2;
			}
		}
		System.out.println("*****�޸Ľ��*****");
		if(!flag){
			System.out.println("���޴��ˣ�");
		}else {
			System.out.println("�ҵ����޸ĳɹ���");
		}
		show(name);
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		String[] a=new String[5];
		student.addStudent(a);
		student.show(a);
		student.updateStudent(a);
	}
}
