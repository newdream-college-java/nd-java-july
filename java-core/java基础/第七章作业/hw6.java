import java.util.Scanner;
public class hw6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ������");
		int n=sc.nextInt();
		int a=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				a++;
			}
		}
		System.out.print("1��"+n+"����"+(n-a)+"��������"+a+"��ż��");
	}
}
				