/*2.1���̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���*/
import java.util.Scanner;
public class Work9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double up = 0;
		double down = 0;
		System.out.print("������˿�������");
		int a = sc.nextInt();
		for(int i =1;i<=a;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int age = sc.nextInt();
			if(age<=30){
				down++;
			}else
				up++;
		}
		System.out.println("30�����µı����ǣ�"+down/a*100+"%");
		System.out.println("30�����ϵı����ǣ�"+up/a*100+"%");
	}
}
