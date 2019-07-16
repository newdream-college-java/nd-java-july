/*用户登录验证。验证次数最多 3 次*/

import java.util.Scanner;
public class Work11{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		for(int i=2;i>=0;i--){
			System.out.print("请输入用户名：");
			String a=input.next();
			System.out.print("请输入密码：");
			int b=input.nextInt();
			if(a.equals("jim")&&b==123456){
				System.out.println("欢迎登陆MyShopping系统！");
				System.exit(-1);
			}else
				System.out.println("输入错误！您还有"+i+"次机会");
		}
		System.out.println("对不起，您3次均输入错误");
	}
}