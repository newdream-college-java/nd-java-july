/*1.6������һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż��*/
import java.util.Scanner;
public class Work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����������");
		int a = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		for(int i =1;i<=a;i++){
			if(i%2==0){
				count1++;
			}else
				count2++;
		}
		System.out.println("ż����"+count1+"��");
		System.out.println("������"+count2+"��");
	}
}