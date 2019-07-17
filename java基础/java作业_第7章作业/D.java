import java.util.Scanner;
public class D{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数字：");
		int a = input.nextInt();
		int f =0;
		int z = 0;
		int l = 0;
		while(a!=999){
		if(a<0){
		f++;
		}else if(a==0){
		l++;
		}else {
		z++;
		a=input.nextInt();
		}
		}
		System.out.println("正数个数为："+z);
		System.out.println("负数个数为："+f);
		System.out.println("0的个数为："+l);
		System.exit(-1);
	}
}