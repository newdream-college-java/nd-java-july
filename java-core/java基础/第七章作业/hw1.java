import java.util.Scanner;
public class hw1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������10���ڵ�������");
		int a=sc.nextInt();
		int b=1;
		if(a<1 || a>10){
			System.out.print("�������");
		}else {
			System.out.print(a+"!=");
			for(int i=a;i>=1;i--){
				if(i==1){
					System.out.print("1");
				}else {
				System.out.print(i+"*");
				b=b*i;
				}
			}
			System.out.print("="+b);
		}
	}
}
		
				