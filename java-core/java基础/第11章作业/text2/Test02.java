package proJob11.text2;

/*ʵ��ϵͳ�˵�������˵���ţ����������л������˵�
�˵�������ϵ��������н����ͼ:*/
import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}
	
	
	public static void login(){
		Scanner sc=new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1. ��¼ϵͳ");
		System.out.println("2. �˳�");
		System.out.print("��ѡ���������֣�");
		int a=sc.nextInt();
		if(a==1){
			menu();
		}else if(a==2){
			System.out.println("���˳���");
			System.exit(-1);
		}else{
			System.out.print("����������������룺");
			a=sc.nextInt();
		}
	}
	
	public static void menu(){
		Scanner sc=new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1. �ͻ���Ϣ����");
		System.out.println("2. �������");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int a=sc.nextInt();
		if(a==1){
			manage();
		}else if(a==2){
			gift();
		}else if(a==0){
			login();
		}else{
			System.out.print("����������������룺");
			a=sc.nextInt();
		}
	}
	
	public static void manage(){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����");
		System.out.println("1. ��ʾ���пͻ���Ϣ");
		System.out.println("2. ��ӿͻ���Ϣ");
		System.out.println("3. �޸Ŀͻ���Ϣ");
		System.out.println("4. ��ѯ�ͻ���Ϣ");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int a=sc.nextInt();
		if(a==1){
			System.out.println("ִ������ʾ���пͻ���Ϣ");
		}else if(a==2){
			System.out.println("ִ������ӿͻ���Ϣ");
		}else if(a==3){
			System.out.println("ִ�����޸Ŀͻ���Ϣ");
		}else if(a==4){
			System.out.println("ִ���˲�ѯ�ͻ���Ϣ");
		}else if(a==0){
			menu();
		}else{
			System.out.print("����������������룺");
			a=sc.nextInt();	
		}
		
	}
	
	public static void gift(){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����");
		System.out.println("1. ���˴����");
		System.out.println("2. ���˳齱");
		System.out.println("3. �����ʺ�");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int a=sc.nextInt();
		if(a==1){
			System.out.println("ִ�������˴����");
		}else if(a==2){
			System.out.println("ִ�������˳齱");
		}else if(a==3){
			System.out.println("ִ���������ʺ�");
		}else if(a==0){
			menu();
		}else{
			System.out.print("����������������룺");
			a=sc.nextInt();
		}
	}

}
