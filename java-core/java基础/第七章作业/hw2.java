import java.util.Scanner;
public class hw2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a="";
		String sum="";
		do{
			sum+=a;
			System.out.print("�������ַ���,����Esc�����˳�");
			a=sc.next();
		}while(!a.equals("Esc"));
		System.out.print(sum);
	}
}
			