package chapter_13_1;
/*1.4ģ�������˻�ҵ�񣺱�д Account �࣬��Ӵ��η���ʵ�ִ���ȡ��ҵ�񣬴���
ʼ 0 Ԫ��ȡ��ʱ��Ҫ�ж�����Ƿ���㣬��ͼ:*/
import java.util.*;
public class Account1 {
	double oldMoney;
	public void menu(){
		System.out.println("1.���\t2.ȡ��\t0.�˳�");
		System.out.print("����������Ҫ�����ҵ��");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		switch(x){
			case 1:
				System.out.print("��������Ҫ��Ľ�");
				double jine1=sc.nextDouble();
				cun(jine1);
				break;
			case 2:
				System.out.print("��������Ҫȡ�Ľ�");
				double jine2=sc.nextInt();
				qu(jine2);
				break;
			case 0:
				System.out.println("ллʹ�ã�");
				System.exit(-1);
			default:
				System.out.println("�������������ѡ��");
				
		}	
	}
	public void cun(double jine){	
		System.out.println("���ɹ���");
		System.out.println();
		oldMoney+=jine;
		System.out.println("***��ǰ���Ϊ��"+oldMoney);
	}
	public void qu(double jine){
		if(oldMoney>=jine){
			System.out.println("ȡ��ɹ���");
			oldMoney-=jine;
			System.out.println("***��ǰ���Ϊ��"+oldMoney);
			System.out.println();
		}else{
			System.out.println("���㣡������ѡ��");
		}
	}
	public static void main(String[] args) {
		Account1 a=new Account1();
		a.oldMoney=800;
		while(true){
			a.menu();
		}
		
		
	}

}
