/*
1.2�� ����һ������Ϊ��FlipFlop������ϷӦ�ó���
���� 1 ������ 100������ 3�ı�����������ʡ�Flip����
���� 5 �ı�����������ʡ�Flop������Ϊ 3 �ı���ҲΪ5 �ı���
�������FlipFlop����������������ǰ����
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("*******FlipFlop*********");
		System.out.print("   ����1��ʼ���У�");
		int st  = input.nextInt();
		while(st!=1){
			System.out.print("���������������������룺");
			st = input.nextInt();
		}
		for(int i = 1;i<=100;i++){
			if(i%15 ==0){
				System.out.println("FlipFlop");
			}
			else if(i%3 == 0){
				System.out.println("Flip");
			}
			else if(i%5 == 0){
				System.out.println("Flop");
			}
			else{
				System.out.println(i);
			}
		}
		
	}
}