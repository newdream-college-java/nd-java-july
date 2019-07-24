/*编写管理员 Manager，使用 show()方法返回管理员信息(使用 return 语句实现信息
的返回)*/
package demo01;

public class Manager {
	String userName="newdream";
	String passWord="0000";
	public String show(){
		String result="";
		result="管理员用户名为："+userName+"  密码为："+passWord;
		return result;
	}
}
