/*1.5����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ������Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9 �����飬����ԭ�ַ����� ����һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ�����һ��λ�� �����µ��ַ�����������*/
import java.util.*;
public class Work04{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		char[] c={0,'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		Arrays.sort(c);
		System.out.print("���������");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		System.out.print("������һ���ַ���");
		char a=input.next().charAt(0);
		int index=0;
		int i=1;
		//���ҵ�Ҫ�����λ��
		for(;i<c.length;i++){
			if(a<c[i]){
				index=i-1;
				break;
			}
		}
		if(i==c.length){
			index=c.length-1;
		}
		System.out.println("��Ҫ����������±�Ϊ��"+index);
		//�ƶ�����Ԫ��
		for(int j=0;j<index;j++){
			c[j]=c[j+1];
		}
		//����Ԫ��
		c[index]=a;
		for(int k=0;k<c.length;k++){
			System.out.print(c[k]+"\t");
		}
	}
}