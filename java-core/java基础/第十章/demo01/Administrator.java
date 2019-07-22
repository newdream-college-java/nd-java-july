package Jul22;

import java.util.Scanner;

public class Administrator {
/*
 *1.1、需求说明
编写管理员类(属性:用户名，密码;方法:show()显示管理员信息) 
创建两个管理员类对象，输出他们的相关信息 
输入旧的用户名和密码，如果正确，才有权限更新
从键盘上获取新的密码，进行更新*/
	String name;
	String password;
	
	public void show(){
		System.out.println("姓名："+name+",密码："+password);
	}
	
	public void login(){
		Scanner input = new Scanner(System.in);
		if((name.equals("admin1")&&password.equals("111111"))||(name.equals("admin2")&&password.equals("222222"))){
			System.out.println();
			System.out.print("请输入新密码");
			password = input.next();
			System.out.print("修改密码成功，您的新密码为"+password);
		}
		else{
			System.out.println("用户名与密码不匹配！您没有权限更新管理员信息。");
		}
	
	}

}
