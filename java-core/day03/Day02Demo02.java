import java.*;
public class Day02Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//3��������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ��
		System.out.println("�����⣺������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ��Ҫ�����볤�Ȳ��ܵ��� 6 λ");
		System.out.print("�����õ�һ������(���볤�Ȳ��ܵ��� 6 λ)��");
		int onepassword=input.nextInt();
		System.out.print("�����õڶ�������(���볤�Ȳ��ܵ��� 6 λ)��");
		int twopassword=input.nextInt();
		System.out.print("�������һ������");
		int inputone=input.nextInt();
			if(inputone==onepassword){
				System.out.print("������ڶ�������");
				int inputtwo=input.nextInt();
				if(inputtwo==twopassword){
					System.out.print("��ϲ���õ�Ǯ��");
				}else{
					System.out.print("�ڶ����������");
				}
				
			}else{
				System.out.print("��һ���������");
			}
	}
}