package chapter_13_1;
/*1.3������˵��
�޸�ѧ�������������¡��������������޸Ĳ���ʾ�Ƿ��޸ĳɹ�*/
import java.util.Scanner;

public class Teacher {
	static String [] stu;
	public void addStu(){
		Scanner sc=new Scanner(System.in);

		for (int i = 0; i < stu.length; i++) {
			System.out.print("������ѧ��������");
			stu[i]=sc.next();
		}
		System.out.println("**************************************");
		System.out.println("\t\tѧ��������Ϣ");
		System.out.println("**************************************");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i]+"\t");
		}
		System.out.println();
	}
	public void updateStu(){
		Scanner sc=new Scanner(System.in);
		System.out.print("������Ҫ�޸ĵ�ѧ����������");
		String oldName1=sc.next();
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].equals(oldName1)){
				System.out.print("�������µĵ�ѧ����������");
				String newName=sc.next();
				stu[i]=newName;
			}
		}
		System.out.println("**************************************");
		System.out.println("\t\tѧ��������Ϣ");
		System.out.println("**************************************");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Teacher t=new Teacher();
		t.stu=new String[5];
		t.addStu();
		t.updateStu();
	}

}
