/*������ GoodLuck ʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ
���˻�Ա*/
import java.util.Scanner;
import java.lang.Math;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>���˳齱");
		System.out.print("������4λ��Ա��");
		int a=input.nextInt();
		int x=(int)(Math.random()*10);
		System.out.println("���ɵ������Ϊ:"+x);
		if(x==a/1000){
			System.out.println(a+"�ſͻ������˿ͻ�����þ���MP3һ��");
		}else{
			System.out.println(a+"�ſͻ���лл����֧��");
		}
	}
}