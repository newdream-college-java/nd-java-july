/*2.1���̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���*/
import java.util.Scanner;
public class Work09{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double count=0;
		int i=0;
		for(;;i++){
			System.out.print("�������"+(i+1)+"λ�˿͵�����(����0����)��");
			int a=sc.nextInt();
			if(a>=30){
				count++;
			}
			if(a==0){
				break;
			}
		}
		System.out.println("30�����µı����ǣ�"+(1-count/i)*100+"%");
		System.out.println("30�����ϵı����ǣ�"+count/i*100+"%");
	}
}