/*�û��������޴ε��������֣���ͳ���û�����������������ĸ���������
�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��*/
import java.util.*;
public class Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��������");
		int num=input.nextInt();
		int count1=0,count2=0,count3=0;
		while(num!=999){
			if(num>0){
				count1++;
			}else if(num<0){
				count2++;
			}else{
				count3++;
			}
			
			System.out.print("������һ��������");
			num=input.nextInt();
		}
		System.out.println("�������");
		System.out.println("�����ĸ���Ϊ��"+count1);
		System.out.println("�����ĸ���Ϊ��"+count2);
		System.out.println("0�ĸ���Ϊ��"+count3);
	}
}