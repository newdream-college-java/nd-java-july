/*����һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż��*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��������");
		int n=input.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				count++;
			}
		}
		System.out.println("��1��"+n+"һ����"+count+"������"+(n-count)+"������");
	}
}