import java.util.Scanner;


public class Account {
	double money=0;
	Scanner sc=new Scanner (System.in);
	public void mainMenu(){
		System.out.println("1.��� 2.ȡ�� 0.�˳�");
		System.out.println("��ѡ������Ҫ�����ҵ��");
		int a=sc.nextInt();
		while(a!=1&&a!=2&&a!=0){
			System.out.println("�������");
			System.out.println("��ѡ������Ҫ�����ҵ��");
			a=sc.nextInt();
		}
		switch(a){
		case 0:
			System.out.println("лл����ʹ��");
			break;
		case 1:
			System.out.print("����������");
			double b=sc.nextDouble();
			chu(b);
			break;
		case 2:
			System.out.print("������ȡ����");
			double c=sc.nextDouble();
			qu(c);
		}
	}
	public void chu(double a){
		money+=a;
		System.out.println(money);
		mainMenu();
	}
	public void qu(double b){
		if(b>money){
			System.out.println("�����˻�����");
			mainMenu();
		}else{
			money-=b;
			System.out.println(money);
			mainMenu();
		}
	}
	public static void main(String[] args) {
		Account acc=new Account();
		acc.mainMenu();
	}

}
