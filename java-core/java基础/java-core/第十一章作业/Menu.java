package chapter_11;
import java.util.*;
public class Menu {
	/**
	 * ��¼�˵�����
	 */
	public void showLoginMenu(){
		System.out.println("**********************************");
		System.out.println("\t��ӭʹ���������ع���ϵͳ������");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		if(a==1){
			showMainMenu();
		}else{
			System.exit(-1);
		}
	}
	/**
	 * ���˵�����
	 */
	public void showMainMenu(){
		System.out.println("**********************************");
		System.out.println("\t�������ع���ϵͳ���˵�");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.����ع�");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int a=input.nextInt();
		if(a==0){
			showLoginMenu();
		}else if(a==1){
			showCustMenu();
		}else{
			showSendGMenu();
		}
	}
	/**
	 * �ͻ���Ϣ����˵�
	 */
	public void showCustMenu(){
		System.out.println("**********************************");
		System.out.println("\t�������ع���ϵͳ>�ͻ���Ϣ����");
		System.out.println("\t1.��ѯ�ͻ���Ϣ");
		System.out.println("\t2.�޸Ŀͻ���Ϣ");
		System.out.println("\t3.��ӿͻ���Ϣ");
		System.out.println("\t4.��ʾ���пͻ���Ϣ");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		if(a==0){
			showLoginMenu();
		}else if(a==1){
			System.out.println("ִ�� ����1.��ѯ�ͻ���Ϣ");
		}else if(a==2){
			System.out.println("ִ�� ����2.�޸Ŀͻ���Ϣ");
		}else if(a==3){
			System.out.println("ִ�� ����3.��ӿͻ���Ϣ");
		}else{
			System.out.println("ִ�� ����4.��ʾ���пͻ���Ϣ");
		}
		
	}
	/**
	 * ����ع˲˵�
	 */
	public void showSendGMenu(){
		System.out.println("*********************************");
		System.out.println("\t�������ع���ϵͳ>����ع�");
		System.out.println("\t1.���˴����");
		System.out.println("\t2.���˳齱");
		System.out.println("\t3.�����ʺ�");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		if(a==0){
			showLoginMenu();
		}else if(a==1){
			System.out.println("ִ�� ����1.���˴����");
		}else if(a==2){
			System.out.println("ִ�� ����2.���˳齱");
		}else{
			System.out.println("ִ�� ����3.�����ʺ�");
		}
	}
}
