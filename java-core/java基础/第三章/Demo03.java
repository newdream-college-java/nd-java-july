/*
3��������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ�� 
�����һ�����붼����ȷ����ֱ�Ӱ����������棻�����һ������������ȷ��������Ȩ����� �������롣ֻ�е��ڶ�������Ҳ������ȷ�������õ�Ǯ��(���������Լ��裬Ҫ�����볤�Ȳ� �ܵ��� 6 λ) 
�������һ������; 
if(��һ��������ȷ){ 
 ������� 2 ������; 
 if(�� 2 ��������ȷ){ 
  ��ϲ�õ�Ǯ�� 
 }else{ 
  �� 2 ��������� 
 } 
}else{ 
 �� 1 ��������� 
} */
import java.util.*;
public class Demo03{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ�����룺");	
		String m1="123456";
		String m2 = "666666";
		String x = input.next();	
		if(m1.equals(x)){
		System.out.print("������ڶ������룺");
		String y = input.next();
			if(m2.equals(y)){
			System.out.print("��ϲ�õ�Ǯ��");
			}
			else
			System.out.print("��2���������");
		}
		else
		System.out.print("��1���������");		
	}
}