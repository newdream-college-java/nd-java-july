/*编写管理员类(属性:用户名，密码;方法:show()显示管理员信息) 
创建两个管理员类对象，输出他们的相关信息*/
package chapter_10;
import java.util.Scanner;
public class admin {
	//定义属性
	String userName;
	int passWord;
	//定义方法
	public void show(){
		
		System.out.println("姓名："+userName+",密码 ："+passWord);
	}
	public void gxmima(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String u=input.next();
		System.out.print("请输入密码：");
		int m=input.nextInt();
		if(u.equals(userName)&&m==passWord){
			System.out.print("请输入新的密码：");
			int newPassword=input.nextInt();
			m=newPassword;
			System.out.println("修改密码成功，您的新密码为："+newPassword);
			
		}else{
			System.out.println("用户名或密码不正确！您没有权限更新管理员信息。");
		}
	}
	public static void main(String[] args) {
		kehu kehu01=new kehu();
		kehu01.cardType="金卡";
		kehu01.score=3050;
		kehu01.huikui();

	}

}
