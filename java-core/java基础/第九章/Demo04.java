/*����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ�����
�Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9 �����飬����ԭ�ַ����� ����
һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ���
��һ��λ�� �����µ��ַ�����������*/
import java.util.*;
public class Demo04{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		char[]a={'0','a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=1;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		Arrays.sort(a);
		System.out.print("���������");
		for(int i=1;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.print("������һ���ַ���");
		String tmp=input.next();
		char []cr=tmp.toCharArray();
		System.out.println("");
		System.out.println("");
		//�ҵ�����λ��
		int b=0;
		int j;
		for(j=1;j<a.length;j++){
			if(cr[0]<a[j]){
				b=j-1;
				break;
			}
		}
		if(j==a.length){
			b=a.length-1;
		}
		//ǰ��
		for(int i=0;i<b;i++){
			a[i]=a[i+1];
		}
		//����
		a[b]=cr[0];
		//���
		System.out.print("�����ַ�����ַ����У�");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.print("�����λ���ǣ�"+b);
	}	
}