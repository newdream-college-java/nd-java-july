/*
����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ�����
�Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9 �����飬����ԭ�ַ����� ����
һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ���
��һ��λ�� �����µ��ַ�����������
*/
import java.util.*;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//���ԭ�ַ�
		char[] arr = {0,'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//����������ַ�
		System.out.print("�������ַ����У�");
		Arrays.sort(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//����Ҫ������ַ�
		System.out.print("������һ���ַ���");
		char a = input.next().charAt(0);
		System.out.println();
		//����
		int index = 0;//�������ֵ��±�
		boolean flag = false;//�����Ҳ�����������������
		for(int i = 1;i<arr.length;i++){
			if(a<arr[i]){
				flag = true;
				index = i-1;
				break;
			}
		}
		if(!flag){
			index = arr.length-1;
		}
		//����������С�������±�ǰ��
		for(int i =0;i<index;i++){
			arr[i] = arr[i+1];
		}
		arr[index] = a;
		System.out.print("�����ַ�������У�");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("������±��ǣ�"+index);
		
		
	}
}