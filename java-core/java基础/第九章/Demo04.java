/*
����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ�����
�Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9 �����飬����ԭ�ַ����� ����
һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ���
��һ��λ�� �����µ��ַ�����������  
*/
import java.util.*;
public class Demo04{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("���������鳤��:");
		int l= input.nextInt();
		char [] a =new char[l];
		for(int i =0;i<l-1;i++){
			System.out.print("�������"+(i+1)+"���ַ�Ϊ��");
			a[i]=input.next().charAt(0);
		}
		System.out.print("ԭ�ַ����У�");
		for(int i =0;i<l-1;i++){
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.print("\n���������");
		for(int i =1;i<l;i++){
			System.out.print(a[i]+" ");
		}
		int index =0;
		boolean flag =false;
		System.out.print("\n������һ���ַ�:");
		char b=input.next().charAt(0);
		for(int i=1;i<l;i++){
			if(b<a[i]){
				flag = true;
				index=i-1;	
				break;
			}
		}
		if(!flag){
			index = l-1;	
		}
		for(int i=0;i<index;i++){
			a[i]=a[i+1];
		}
		a[index]=b;
		System.out.print("\n�����ַ�����ַ����У�");
		for(int i =0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n����λ�ã�"+index);
	}
}