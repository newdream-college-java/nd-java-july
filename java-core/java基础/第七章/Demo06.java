/*1.6������һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż��*/
import java.util.*;
public class Demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ������ n��");
		int n=input.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("1��"+n+"��"+sum2+"������");
		System.out.println("1��"+n+"��"+sum1+"��ż��");
	}
}