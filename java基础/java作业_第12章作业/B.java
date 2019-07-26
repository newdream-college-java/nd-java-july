import java.util.Scanner;


public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B p = new B();
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入姓名：");
		String name=input.next();
		System.out.print("请输入性别：");
		String sex=input.next();
		System.out.print("请输入年龄：");
		int age=input.nextInt();
		
		p.show(name,sex, age);
	}
	public void show(String a,String b,int c){
		System.out.println("--------人员信息--------");
		System.out.println("人员信息如下：");
		System.out.print("姓名："+a);
		System.out.print("性别："+b);
		System.out.print("年龄："+c);
	}

}
