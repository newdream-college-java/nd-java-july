import java.util.Scanner;
public class hw7{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.print("请输入整数数组长度");
		int length=sc.nextInt();
		int a[]=new int[length];
		int b[]=new int[length];
		for(int i=1;i<=length;i++){
			System.out.print("请输入第"+i+"个整数:");
			int num=sc.nextInt();
			a[i-1]=num;
			b[i-1]=num;
		}
		int k=1;
		int c;
		for(int i=0;i<=length-1;i++){
			if(i==length-k){
				break;
			}
			c=b[i];b[i]=b[length-k];b[length-k]=c;
			k++;
		}
		for(int i=0;i<=length-1;i++){
			if(b[i]<0){
				b[i]=0;
			}
			System.out.print(b[i]+"\t");
		}
	}
}