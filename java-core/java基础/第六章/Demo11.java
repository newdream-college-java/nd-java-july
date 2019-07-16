/*
2.3、用户登录验证。验证次数最多 3 次
*/
import java.util.Scanner;
public class Demo11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i = 2;
		for(;i>=0;i--){
			System.out.print("请输入用户名：");
			String name = input.next();
			System.out.print("请输入密码：");
			String password = input.next();
			if(!(name.equals("cxh"))||!(password.equals("cxhcxh"))){
				System.out.println("输入错误！您还有"+i+"次机会！");
				System.out.println("         ");
				continue ;
			}
			if((name.equals("cxh"))&&(password.equals("cxhcxh"))){
				System.out.println("欢迎使用购物管理系统！");
				break ;
			}
		}
		if(i == -1){
			System.out.println("对不起，您3此均输入错误。程序终止！！！");
		}
	}
}