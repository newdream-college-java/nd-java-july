/*
1.6������һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż��
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		int j = 0;
		int o = 0;
		for(int i = 1;i<=num;i++){
			if(i%2 == 0){
				o++;
			}
			else{
				j++;
			}
		}
		System.out.println("1��"+num+"����"+j+"��������"+o+"��ż����");
	}
}