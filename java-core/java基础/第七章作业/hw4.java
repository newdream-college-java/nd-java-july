import java.util.Scanner;
public class hw4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("��������999�����˳�");
		int a=0;
		int b=0;
		int c=0;
		double num;
		do{
			System.out.print("������һ������");
			num=sc.nextDouble();
			if(num>0){
				a++;
			}else if(num==0){
				b++;
			}else {
				c++;
			}
		}while(num!=999);
		System.out.println("�����ĸ���Ϊ"+a);
		System.out.println("��ĸ���Ϊ"+b);
		System.out.println("�����ĸ���Ϊ"+c);
	}
}