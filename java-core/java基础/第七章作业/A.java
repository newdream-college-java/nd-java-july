/*1.1�� ���ʵ�ֽ����û����������������������Ľ׳ˡ����磺�������� 4������� 4!=4*3*2*1=24��Ҫ���������� 1~10��������ʾ����*/
import java.util.*;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//ʵ����ɨ����
 		int a=input.nextInt();
		int sum=1;			//�洢������
		String s="";
		for(int i=1;i<=a;i++){		//��׳�
			sum*=i;
		}
		for(int i=a-1;i>0;i--){		//����������
			s+=("*"+i);
		}
		System.out.println(a+"!="+a+s+"="+sum);
	}
}