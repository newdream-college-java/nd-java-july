/*
5���������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼���
�����������е�ֵ��С��������
*/
import java.util.*;
public class Demo05{
	public static void main(String [] args){
		System.out.println("����������int�͵�����");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int x = 0;
		if(a<b){
		x=a;a=b;b=x;
		}
		if(a<c){
		x=a;a=c;c=x;
		}
		if(b<c){
		x=b;b=c;c=x;
		}
		System.out.print(c+"\t"+b+"\t"+a);
	}
}