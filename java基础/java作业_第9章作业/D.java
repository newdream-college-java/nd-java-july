import java.util.Arrays;
import java.util.Scanner;
public class D{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		char[] a ={'a','c','u','b','e','p','f','z',' '};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("���������");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.print("������һ���ַ���");
		String b = input.next();
		char ab = b.charAt(0);
		
		int index=0;
		for(int i=0;i<a.length;i++){
			if(ab<a[i]){
			index=i-1;
			break;
		}
		}
		for(int i=0;i<index;i++){
		a[i]=a[i+1];
		}
		a[index]=ab;
		System.out.print("�������ַ������ǣ�"+Arrays.toString(a)+"\n");
		System.out.print("�����λ���ǣ�"+index);
}
}