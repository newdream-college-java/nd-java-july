import java.*;
public class Day02Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//3、现在有一个银行保险柜，有两道密码。想拿到里面的钱必须两次输入的密码都要正确。
		System.out.println("第三题：现在有一个银行保险柜，有两道密码。想拿到里面的钱必须两次输入的密码都要正确。要求密码长度不能低于 6 位");
		System.out.print("请设置第一道密码(密码长度不能低于 6 位)：");
		int onepassword=input.nextInt();
		System.out.print("请设置第二道密码(密码长度不能低于 6 位)：");
		int twopassword=input.nextInt();
		System.out.print("请输入第一道密码");
		int inputone=input.nextInt();
			if(inputone==onepassword){
				System.out.print("请输入第二道密码");
				int inputtwo=input.nextInt();
				if(inputtwo==twopassword){
					System.out.print("恭喜你拿到钱了");
				}else{
					System.out.print("第二道密码错误");
				}
				
			}else{
				System.out.print("第一道密码错误");
			}
	}
}