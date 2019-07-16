/*
2.3、用户登录验证。验证次数最多 3 次
*/
import java.util.*;
public class Demo11{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("创建用户名：");
		String name1 = input.next();
		System.out.print("创建密码：");
		int a = input.nextInt();
		for(int i =1;i<=3;i++){
			System.out.print("请输入用户名：");
			String name2 = input.next();
			if(name2.equals(name1)){
				System.out.print("请输入密码：");
				int b = input.nextInt();
				if(a==b){
					System.out.print("欢迎登录MyShopping系统");
					break;
				}
				else{
					System.out.println("密码错误,你还有"+(3-i)+"次机会");
				}	
			}
			else{
				System.out.println("用户名错误,你还有"+(3-i)+"次机会");
			}
			if(i==3){
				System.out.print("对不起，您3次输入错误");
			}
		}
	}
}