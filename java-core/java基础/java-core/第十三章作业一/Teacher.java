package chapter_13_1;
/*1.3、需求说明
修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功*/
import java.util.Scanner;

public class Teacher {
	static String [] stu;
	public void addStu(){
		Scanner sc=new Scanner(System.in);

		for (int i = 0; i < stu.length; i++) {
			System.out.print("请输入学生姓名：");
			stu[i]=sc.next();
		}
		System.out.println("**************************************");
		System.out.println("\t\t学生姓名信息");
		System.out.println("**************************************");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i]+"\t");
		}
		System.out.println();
	}
	public void updateStu(){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要修改的学生的姓名：");
		String oldName1=sc.next();
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].equals(oldName1)){
				System.out.print("请输入新的的学生的姓名：");
				String newName=sc.next();
				stu[i]=newName;
			}
		}
		System.out.println("**************************************");
		System.out.println("\t\t学生姓名信息");
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
