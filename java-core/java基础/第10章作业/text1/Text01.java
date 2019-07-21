package text1.praJob10;
/*
 编写管理员类(属性:用户名，密码;方法:show()显示管理员信息) 
创建两个管理员类对象，输出他们的相关信息.......
 */
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Text01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Adminis adm1=new Adminis();
		Adminis adm2=new Adminis();
		System.out.print("请输入管理员1的姓名：");
		adm1.name=input.next();
		System.out.print("请输入管理员1的密码：");
		adm1.psw=input.next();
		System.out.print("请输入管理员2的姓名：");
		adm2.name=input.next();
		System.out.print("请输入管理员i的密码：");
		adm2.psw=input.next();
		adm1.show();
		adm2.show();
		
		System.out.print("请输入用户名：");
		String iname=input.next();
		System.out.print("请输入密码：");
		String ipsw=input.next();
		if((iname.equals(adm1.name)&&ipsw.equals(adm1.psw))||(iname.equals(adm2.name)&&ipsw.equals(adm2.psw))) {
			System.out.print("请输入新密码：");
			String newpsw=input.next();
			System.out.print("修改密码成功，您的新密码为："+newpsw);
		}else {
			System.out.print("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
		
	}

}
