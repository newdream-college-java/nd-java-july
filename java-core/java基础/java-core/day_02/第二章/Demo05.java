/*5������һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ���������룺25����ô�����1 ���� 1 ��Сʱ��*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("������Сʱ����");
		int n=in.nextInt();
		int d,h;
		d=n/24;
		h=n%24;
		System.out.println(d+"����" +h+"��Сʱ");	
	}
}