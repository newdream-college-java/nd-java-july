/*1.6������һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż��*/
import java.util.*;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ������");
		int num=input.nextInt();
		int count1=0,count2=0;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				count1++;
			}else{
				count2++;
			}
		}
		System.out.println("������"+count1+"��\n"+"ż����"+count2+"��\n");
	}
}