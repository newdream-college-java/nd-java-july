/*����һ����λ�����������ǲ��ǽ�����*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��������");
		int a=input.nextInt();
		if(a/100>a/10%10&&a/10%10>a%10){
			System.out.println(a+"�ǽ�����");
		}else{
			System.out.println(a+"���ǽ�����");
		}
	}
}