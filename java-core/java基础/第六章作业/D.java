/*1.4����� 10000-99999 ��������л�������˵�������磺12321 �ǻ���������λ�� ��λ��ͬ��ʮλ��ǧλ��ͬ��12321 99999 99899*/
import java.util.*;
public class D{
	public static void main(String[] srgs){
		System.out.println("10000-99999 ��������л�����:");
		for(int i=10000;i<100000;i++){
			if(i%10==i/10000&&i/10%10==i/1000%10){
				System.out.println(i);
			}
		}
	}
}