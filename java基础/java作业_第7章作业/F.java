import java.util.Scanner;
public class F{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = input.nextInt();
		int b = 0;
		int c = 0;
		for(int i = 1;i<=a;i++){
		if(i%2==0){
		b++;
		}else {
		c++;
		}
		}
		System.out.println("�����У�"+c+"��");
		System.out.println("ż���У�"+b+"��");
}
}