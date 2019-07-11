/*3、现在有一个银行保险柜，有两道密码。想拿到里面的钱必须两次输入的密码都要正确。如果第一道密码都不正确，那直接把你拦在外面；如果第一道密码输入正确，才能有权输入第二道密码。只有当第二道密码也输入正确，才能拿到钱！(两道密码自己设，要求密码长度不能低于6位)*/
import java.util.*;
public class Demo03{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入第一个六位数密码：");
		int n=in.nextInt();
		if(n==666666){
			System.out.print("请输入第二个六位数密码：");
			int m=in.nextInt();
			if(n==888888){
		    		System.out.println("恭喜拿到钱了！！");
			}else {
				System.out.println("第二道密码错误！");
			}
		}else System.out.println("第一道密码错误！！");
			
	}
}