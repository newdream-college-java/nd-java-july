import java.util.Scanner;
import java.util.Arrays;
public class hw4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		char a[]={' ','a','c','u','b','e','p','f','z'};
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入一个字符");
		String b=sc.next();
		char c[]= b.toCharArray();
		if(c.length>1){
			System.out.print("输入错误");
			return;
		}
		char d=c[0];
		int i=0;
		for(;i<=a.length-1;i++){
			if(a[i]>d){
				for(int j=0;j<i;j++){
					a[j]=a[j+1];
				}
				a[i-1]=d;
				break;
			}
		}
		for(int k=0;k<=a.length-1;k++){
			System.out.print(a[k]+"\t");
		}
		System.out.print("\n插入的位置为"+(i-1));							
	}
}
		