/*用户登录验证。验证次数最多3次*/
import java.util.*;
public class Demo11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("请输入用户名：");
			String name=input.next();
			System.out.print("请输入密码：");
			String psw=input.next();
			if(psw.equals("123456")){
				System.out.println("欢迎登录MyShopping系统！");
				break;
			}else{
				System.out.println("输入错误！您还有"+(3-i)+"次机会！");
				if((3-i)==0){
					System.out.println("\n对不起，您3次均输入错误！");
				}
			}
		}
	}
}