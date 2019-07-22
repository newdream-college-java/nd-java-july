/*编写管理员类(属性:用户名，密码;方法:show()显示管理员信息) 
创建两个管理员类对象，输出他们的相关信息
输入旧的用户名和密码，如果正确，才有权限更新
从键盘上获取新的密码，进行更新
*/
package Demo01;
import java.util.*;
public class Administrator {
	String name;
	String passWord;
	public void show(){
		System.out.println("姓名："+name+",密码："+passWord);
	}
	public void gxpassword(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String name1=input.next();
		System.out.print("请输入密码:");
		String passWord1=input.next();
		System.out.println();
		System.out.println();
		if(name1.equals(name)&&passWord1.equals(passWord)){
			System.out.print("请输入新密码:");
			passWord=input.next();
			System.out.println("修改密码成功，您的新密码为："+passWord);
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更改管理员信息！！！");
		}
	}
}
