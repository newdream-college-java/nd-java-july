import java.util.Scanner;
public class G{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4位会员号：");
		int a = input.nextInt();
		if(a/100%10==2){
		System.out.println(a+"号客户是幸运客户，获得精美Mp3一个。");
		}else
		{
		System.out.println(a+"号客户谢谢您的支持！");
		}
}
}