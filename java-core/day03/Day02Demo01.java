import java.util.Scanner;
public class Day02Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//1������һ����λ�����������ǲ��ǽ�������:531 �ǽ����� ��λ>ʮλ>��λ
		System.out.println("��һ�⣺����һ����λ�����������ǲ��ǽ�������:531 �ǽ����� ��λ>ʮλ>��λ");
		int theInteger=input.nextInt();
		int ones=theInteger%10;
		int ten=theInteger/10%10;
		int hundred=theInteger/100%10;
		if(hundred>ten && ten>ones){
			System.out.println("�ǽ�����   "+hundred+">"+ten+">"+ones);
		}else{
			System.out.println("���ǽ�����");
		}
		System.out.println("******************************�ƽ�ָ���************************");
		//2������һ����ݣ��������껹��ƽ��
		System.out.println("�ڶ��⣺����һ����ݣ��������껹��ƽ��");
		int years=input.nextInt();
		if(years%400==0 || years%4==0 && years%100!=0){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
		}
		System.out.println("******************************�ƽ�ָ���************************");
		
			
	}
	
}