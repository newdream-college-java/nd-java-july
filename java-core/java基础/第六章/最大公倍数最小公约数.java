import java.util.Scanner;
public class Demo03{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ����a��");
		int a=input.nextInt();
		System.out.print("������ڶ�����b��");
		int b=input.nextInt();
		int Max=a>b?a:b;
		int Min=a<b?a:b;
		int iMax=0;
		int iMin=0;
		//����С������
		for(int i=Max;i<=(a*b);i++){
			if(i%a==0&&i%b==0){
				iMin=i;
				break;
			}
		}      
		//�����Լ��
		for(int i=Min;i>=1;i--){
			if(a%i==0&&b%i==0){
				iMax=i;
				break;
			}
		}
		System.out.println("��С������Ϊ��"+iMin);
		System.out.println("���Լ��Ϊ��"+iMax);
	}
}