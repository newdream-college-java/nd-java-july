/*1.4���û��������޴ε��������֣���ͳ���û�����������������ĸ���������
�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��*/
import java.util.*;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count1=0,count2=0,count3=0;
		while(true){
			System.out.print("���������֣�");
			int a=input.nextInt();
			if(a>0&&a!=999){
				count1++;
			}else if(a<0){
				count2++;
			}else if(a==0){
				count3++;
			}else{
				break;
			}
		}
		System.out.println("������"+count1+"��\n"+"������"+count2+"��\n"+"0��"+count3+"��");
	}
}
