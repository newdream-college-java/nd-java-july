/*5����������int�͵����ݣ����뵽a,b,c����������ȥ��ʹ�������ṹ�뽻���߼��������������е�ֵ��С�������С�*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("����������������");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int temp;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	
	}
}