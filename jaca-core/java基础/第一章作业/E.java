import java.util.Scanner;

public class E{
	public static void main(String[] args){
		System.out.println("**************************************\n");
		System.out.println("     欢迎使用我行我素购物管理系统     \n");
		System.out.println("              1.登陆系统              \n");
		System.out.println("              2.退    出              \n");
		System.out.println("**************************************\n");
	
		 Scanner sc = new Scanner(System.in); 
		 int a=sc.nextInt();
		 if(a==1){
			 System.out.println("     欢迎使用我行我素购物管理系统     \n");
			 System.out.println("**************************************\n");
		     System.out.println("              1.客户信息管理          \n");
		     System.out.println("              2.购物结算              \n");
		     System.out.println("              3.真情回馈              \n");
			 System.out.println("              4.注销                  \n");
		     System.out.println("**************************************\n");
		 }else return 0;
	}
}