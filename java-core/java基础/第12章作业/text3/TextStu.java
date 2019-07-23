package job01.text3;
//修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功
import java.util.Scanner;

public class TextStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Student student=new Student();
		System.out.print("请输入数组长度：");
		int n=scanner.nextInt();
		String[] arr=new String[n];
		student.modi(arr);
	}

}
