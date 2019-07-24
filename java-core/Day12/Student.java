import java.util.Scanner;

/**
 * 修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功
 * 
 * @author 54975
 * 
 */
public class Student {
	String[] array = new String[5];
	boolean fals = false;

	public void addStudent(String name) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				fals = true;
				array[i] = name;
				break;
			}
		}
		if (!fals) {
			System.out.println("数组已满");
			return;
		}
	}

	public void show() {
		System.out.println("*****************************");
		System.out.println("\t 客户姓名列表");
		System.out.println("*****************************");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	public void updata(String name, String updataname) {
		System.out.println("********修改结果*********");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(name)) {
				fals = true;
				array[i] = updataname;
				System.out.println("找到并修改成功");
				break;
			}
		}
		if (!fals) {
			System.out.println("没找到修改失败");
			return;
		}
	}
	public static void main(String[] args) {
		Student s=new Student();
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入客户姓名:");
			String name=input.next();
			s.addStudent(name);
		}
		s.show();
		System.out.println();
		System.out.print("请输入要修改的用户姓名");
		String name=input.next();
		System.out.print("请输入要添加的新用户姓名");
		String updataname=input.next();
		s.updata(name, updataname);
		s.show();
	}
}
