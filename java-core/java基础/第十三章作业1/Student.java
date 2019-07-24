package 第十三章作业1;
/*1.3、需求说明
修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功
*/
import java.util.Scanner;


public class Student {
	//String[] name=new String[5];
	Scanner input = new Scanner(System.in);
	public void addStudent(String[] name) {
		for (int i = 0; i < name.length; i++) {
			System.out.print("请输入客户姓名：");
			name[i]=input.next(); 
		}
	}
	
	public void show(String[] name) {
		System.out.println("****************************************");
		System.out.println("\t\t客户姓名列表");
		System.out.println("****************************************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		System.out.println();
	}
	public void updateStudent(String[] name) {
		System.out.print("请输入要修改的客户姓名：");
		String s1=input.next();
		boolean flag=false;
		for (int i = 0; i < name.length; i++) {
			if (s1.equals(name[i])) {
				flag=true;
				System.out.print("请输入新的客户姓名：");
				String s2=input.next();
				name[i]=s2;
			}
		}
		System.out.println("*****修改结果*****");
		if(!flag){
			System.out.println("查无此人！");
		}else {
			System.out.println("找到并修改成功！");
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
