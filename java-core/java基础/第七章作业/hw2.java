import java.util.Scanner;
public class hw2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a="";
		String sum="";
		do{
			sum+=a;
			System.out.print("请输入字符串,输入Esc即可退出");
			a=sc.next();
		}while(!a.equals("Esc"));
		System.out.print(sum);
	}
}
			