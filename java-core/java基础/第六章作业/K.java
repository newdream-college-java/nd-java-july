/*2.3、用户登录验证。验证次数最多 3 次*/
import java.util.*;
public class K{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
		String name="lili",password="123456";
		int i=1;
		for(;i<=3;i++){
			System.out.print("请输入用户名：");
			String s1=input.next();
			System.out.print("请输入密码：");
			String s2=input.next();
			if(s1.equals(name)&&s2.equals(password)){
				System.out.print("欢迎登陆MyShopping系统！！！");
				break;
			}else{
				System.out.print("输入错误！您还有"+(3-i)+"次机会！\n");
			}
		}
		if(i==4){
			System.out.print("对不起，您三次输入错误！");
		}
	}
}