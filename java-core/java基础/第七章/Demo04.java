/*
1.4���û��������޴ε��������֣���ͳ���û�����������������ĸ��������� 
�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��
*/
import java.util.*;
public class Demo04{
	public static void main (String [] args){
		int count1=0,count2=0,count3=0;
		while(true){
			Scanner input = new Scanner (System.in);
			System.out.print("������һ��������");
			if(input.hasNextInt()){
				int a = input.nextInt();
				if(a==999){
					System.out.println("������"+count1+"��");
					System.out.println("������"+count2+"��");
					System.out.print("����"+count3+"��");
					break;
				}else if(a<0){
					count2++;
				}else if(a>0){
					count1++;
				}else{
					count3++;
				}
			}else{
				System.out.println("��������������");		
			}
		}
	}
}