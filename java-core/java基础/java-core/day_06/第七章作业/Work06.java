/*1.6������һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż��*/
import java.util.Scanner;
public class Work06{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ��������");
		int a=sc.nextInt();
		int count_j=0;
		int count_o=0;
		for(int i=1;i<=a;i++){
			if(i%2==0){
				count_o++;
			}else {
				count_j++;
			}
		}
		System.out.println("������"+count_j);
		System.out.println("ż����"+count_o);
	}
}