import java.awt.im.InputContext;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
/*
 ����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ�����
�Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9 �����飬����ԭ�ַ����� ����
һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ���
��һ��λ�� �����µ��ַ����������� 
 */

public class Demo04 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������鳤�ȣ�");
		int n=input.nextInt();
		char arr[]=new char[n+1];
		shuRu(arr);
		System.out.print("ԭ�ַ����У�");
		shuChu(arr);
		sorts(arr);
		System.out.print("������һ���ַ���");
		char zf=input.next().charAt(0);
		System.out.println("\n");
		cha(arr, zf);
	}
	
	public static void shuRu(char arr[]){
		arr[0]=' ';
		for(int i=1;i<arr.length;i++){
			Scanner input=new Scanner(System.in);
			System.out.print("�������"+i+"���ַ���");
			arr[i]=input.next().charAt(0);
		}
	}
	
	public static void shuChu(char arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void sorts(char arr[]){
		Arrays.sort(arr);
		System.out.println();
		System.out.print("������ַ����У�");
		shuChu(arr);
		System.out.println();
	}
	
	public static void cha(char arr[],char zf){
		int index=0;
		boolean flag=false;
		for(int i=1;i<arr.length;i++){
			if(zf<=arr[i]){
				index=i-1;
				flag=true;
				break;
			}
		}
		if(!flag){
			index=arr.length-1;
		}
		for(int i=0;i<index;i++){
			arr[i]=arr[i+1];
		}
		arr[index]=zf;
		System.out.println();
		System.out.print("�����ַ�����ַ����У�");
		shuChu(arr);
		System.out.println();
		System.out.print("�����λ�ã�"+index);
	}
}
