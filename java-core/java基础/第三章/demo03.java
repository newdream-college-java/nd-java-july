/*3、现在有一个银行保险柜，有两道密码。想拿到里面的钱必须两次输入的密码都要正确。
如果第一道密码都不正确，那直接把你拦在外面；如果第一道密码输入正确，才能有权输入第
二道密码。只有当第二道密码也输入正确，才能拿到钱！(两道密码自己设，要求密码长度不
能低于 6 位)*/
import java.util.Scanner;
public class demo03{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		String m1="yuankun123";
		String m2="yuankun321";
		System.out.println("请输入第一道密码：");
		String a = input.next();
		if(a.equals(m1)){
			System.out.println("请输入第二道密码：");
			String b = input.next();
			if(b.equals(m2)){
				System.out.println("恭喜拿到钱了");
			}else{
				System.out.println("第二道密码错误");
			}
		}else{
			System.out.println("第一道密码错误");
		}
		
	}
}