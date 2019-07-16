/*2.3、用户登录验证。验证次数最多 3 次*/
import java.util.Scanner;
public class Demo11{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int i=3;
		for(;i>=1;i--){
			System.out.print("请输入用户名：");
			String user=input.next();
			System.out.print("请输入密码：");
			String passWord=input.next();
			if(user.equals("yuankun")&&passWord.equals("123456")){
				System.out.print("欢迎登陆MyShopping系统!");
				break;
			}else{
				System.out.println("输入错误！您还有"+(i-1)+"次机会!");
				System.out.println("");	
				System.out.println("");
			}
		}
		if(i==0){
			System.out.print("对不起,您3次均输入错误!");	
		}
	}
}