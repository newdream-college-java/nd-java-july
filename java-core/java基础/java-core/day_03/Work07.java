/*2.6�����ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ��������������� ������*/
import java.util.*;
public class Work07{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������������������");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("��������Ҫ���еĲ�����");
		String s=sc.next();
		if(s.equals("+")){
			System.out.println(a+b);
		}else if(s.equals("-")){
			System.out.println(a-b);
		}else if(s.equals("*")){
			System.out.println(a*b);
		}else  if(s.equals("/")){
			System.out.println(a/b);
		}else {
			System.out.println("��������ȷ�Ĳ���Ŷ��");
		}
	}

}