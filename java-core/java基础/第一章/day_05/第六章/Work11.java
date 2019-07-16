/*2.3、用户登录验证。验证次数最多 3 次*/
import java.util.Scanner;
public class Work11{
	public static void main(String[] args ){
		Scanner sc=new Scanner(System.in);
		int i=1;
		for(;i<=3;i++){
			System.out.print("请输入用户名：");
			String userName=sc.next();
			System.out.print("请输入密码：");
			int passWord=sc.nextInt();
			if(userName.equals("clc")&&passWord==666666){
				System.out.println("欢迎登录MyShopping系统！");
				break;
			}else {
				System.out.println("输入错误!您还有"+(3-i)+"次机会！");				
				
			}
			
		}
		if(i==4){
			System.out.println("对不起！您3次输入均错误！！");	
		}
	}
}