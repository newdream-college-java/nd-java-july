/*7��������GoodLuckʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա*/
import java.util.*;
public class Demo07{
	public static void main(String [] args){
		System.out.println("�������ع������ϵͳ>���˳齱");
		Scanner input=new Scanner(System.in);
		System.out.print("������4λ��Ա�ţ�");
		int n=input.nextInt();
		int m=(int)(Math.random()*9+0);
		if(n==m){
			System.out.println(n+"�������˿ͻ�����ñ���һ��������");
		}else {
			System.out.println(n+"�ſͻ���лл���֧�֣�����");
		} 
	}
}