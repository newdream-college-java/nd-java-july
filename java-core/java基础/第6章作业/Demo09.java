/*�̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���*/
import java.util.*;
public class Demo09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int  ages=input.nextInt();
			if(ages<=30){
				count++;	
				continue;
			}
		}
		double p=(count/10.0)*100;
		System.out.println("30�꼰���µı����ǣ�"+p+"%");
		System.out.println("30�����ϵı����ǣ�"+(100-p)+"%");
	}
}