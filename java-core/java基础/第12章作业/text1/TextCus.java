package job01.text1;
//创建客户业务类 CustomerBiz,实现客户姓名的添加和显示，
import java.util.Scanner;

public class TextCus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerBiz cus=new CustomerBiz();
		Scanner input=new Scanner(System.in);
		System.out.print("请输入客户数(可以不输入满)：");
		int n=input.nextInt();
		String[] arr=new String[n];
		cus.show(arr);
	}

}
