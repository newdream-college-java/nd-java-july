/*
2������һ����ݣ��������껹��ƽ��
*/
import java.util.*;
public class Demo02{
	public static void main(String [] args){
		System.out.print("��������ݣ�");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x%4!=0||x%100==0&&x%400!=0)
		System.out.print("����ƽ��");
		else
		System.out.print("��������");
	}
}