import java.util.Scanner;
public class H{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("****************************");
		System.out.println("\t1���ͻ���Ϣ����");
		System.out.println("\t2���������");
		System.out.println("\t3���������");
		System.out.println("\t4��ע��");
		System.out.println("****************************");
		System.out.println("��ѡ���������֣�");
		int a = input.nextInt();
		while(a!=2){
		System.out.println("����������������룺");
		a=input.nextInt();
		}
		System.out.println("ִ�й�����㣡");
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println("*************************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*************************************************");
		System.out.print("��������Ʒ��ţ�");
		int b =input.nextInt();
		if(b==1){
		System.out.print("�����빺��������");
		int c = input.nextInt();
		if(c==2){
		System.out.println("T��\t��245.0\t����:2\t�ϼƣ�490.0");
		System.out.print("�Ƿ������y/n��:");
		String d = input.next();
		System.out.println("\n\n");
		if(d.equals("n")){
		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����392.0");
		System.out.print("ʵ����");
		double e = input.nextDouble();
		System.out.print("��Ǯ��"+(e-392.0));
		}
		}else{
		System.out.println("�����С�����");
		}
		}
	}
}
		
		
