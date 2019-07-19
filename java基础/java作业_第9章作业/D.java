import java.util.Arrays;
import java.util.Scanner;
public class D{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		char[] a ={'a','c','u','b','e','p','f','z',' '};
		System.out.print("原字符序列：");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("升序排序后：");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入一个字符：");
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
		System.out.print("插入后的字符序列是："+Arrays.toString(a)+"\n");
		System.out.print("插入的位置是："+index);
}
}