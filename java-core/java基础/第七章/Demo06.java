/*
1.6������һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż�� 
*/
import java.util.*;
public class Demo06{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int count1=0,count2=0;
		if(input.hasNextInt()){
			int n =input.nextInt();
			if(n<=0){
				System.out.print("���������1������");
			}else{
				for(int i=1;i<=n;i++){
					if(i%2==0){
						count1++;
					}else{
						count2++;
					}
				}
			System.out.print("������"+count2+"��ż����"+count1+"��");
			}
		}else{
			System.out.print("���벻�Ϸ�");
		}
		
	}
}
