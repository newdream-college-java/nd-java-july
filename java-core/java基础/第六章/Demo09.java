/*2.1���̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���*/
import java.util.*;
public class Demo09{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"�˿����䣺");
			int yearsOld=input.nextInt();
			if(yearsOld>30){
				count++;
			}
		}
		System.out.println("30�����µı����ǣ�"+((10-count)/10.0*100)+"%");
		System.out.println("30�����ϵı����ǣ�"+(count/10.0*100)+"%");
	}
}