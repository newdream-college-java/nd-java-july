/*
2.1���̳��Թ˿͵������ν��е������������εĹ˿�
*/
import java.util.Scanner;
public class Demo09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int old = 0;
		int young = 0;
		for(int i =1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int age = input.nextInt();
			if(age>30){
				old++;
				sum++;
			}
			if(age<30){
				young++;
				sum++;
			}
		}
		System.out.println("30�����µı����ǣ�"+(young*100.0/sum)+"%");
		System.out.println("30�����ϵı����ǣ�"+ (old*100.0/sum)+"%");
	}
}