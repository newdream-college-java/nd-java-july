/*
2.1���̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���
*/
import java.util.*;
public class Demo09{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Ҫ�������λ�˿ͣ�");
		int a = input.nextInt();
		double sum=0.0;
		for(int i=1;i<=a;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int b = input.nextInt();
			if(b<30){
				sum+=1;
			}
		}
		System.out.println("30�����µı����ǣ�"+sum/a*100+"%");
		System.out.println("30�����ϵı����ǣ�"+(100-(sum/a*100))+"%");
	}
}