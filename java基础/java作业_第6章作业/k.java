import java.util.Scanner;
public class K{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		for(int i = 3;i>=1;i--){
		String a = input.next();
		System.out.println("请输入密码：");
		int b = input.nextInt();
		if(!a.equals("czq") || b!=1212122){
		System.out.println("输入错误！您还有"+(i-1)+"次机会!/n/n");
		System.out.println("请输入用户名：");
		
		}else{
		break;
		}
		}
		System.out.println("欢迎登录MyShopping系统！");
		}
}
		
		