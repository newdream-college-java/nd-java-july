/*2.1���̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���*/
import java.util.*;
public class I{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=10;i++){
			System.out.print("��"+i+"λ�˿͵�����Ϊ��");
			int a=input.nextInt();
			if(a<30){		
				count++;			
			}
		}
		System.out.println("��ʮ�����µı����ǣ�"+(count/10.0)*100+"%");		
		System.out.println("��ʮ�����ϵı����ǣ�"+(1-count/10.0)*100+"%");
	}
}