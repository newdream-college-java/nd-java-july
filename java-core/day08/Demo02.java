import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		/*1.3�� ѭ�� 365 �죬ÿ������η���Ҫ��ʹ��Ƕ��ѭ������ɡ��ڹ�һ����������
		���ֹ���һ�족��Ȼ����һ����Ҫ��������ҳ���һ�ٷ������Ρ�*/
		for(int i=1;i<=365;i++){
			for(int j=1;j<=3;j++){
				System.out.println("�ҳ���һ�ٷ�");
			}
			System.out.println("�����ֹ���һ��");
		}
		/*1.4�� ���:1!+2��+3��+4��+......+10!*/
		int sum=1;
		int svn=1;
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				svn*=j;
			}
			sum+=svn;
			if(i==10){
			System.out.print(i+"!");
			}else{
			System.out.print(i+"!+");
			}
		}
		System.out.println("="+sum);
	}
}