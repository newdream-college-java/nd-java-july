/*	�û��������޴ε��������֣���ͳ���û�����������������ĸ���������
	�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��
 */
import java.util.Scanner;

public class D{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int count1=0,count0=0,count=0;
		while(true){
			int a=input.nextInt();
			//�ж��Ƿ��˳�
			if(a==999){
				break;
			}
			//�ж�a�ķ�Χ��������Ӧ�ļ�������һ
			if(a<0){
				count++;
			}else if(a==0){
				count0++;
			}else{
				count1++;
			}
		}
		System.out.println("�����ĸ���:"+count1);
		System.out.println("�����ĸ���:"+count);
		System.out.println("0�ĸ���:"+count0);
	}
}