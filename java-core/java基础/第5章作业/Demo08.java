/*MyShopping����ϵͳ*/
import java.util.*;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a,num,e=0;
		String name=null;
		double price=0,mon,sum=0;
		String b;
		while(MyShopping(e)==2){
			System.out.println("MyShoping����ϵͳ > �������");
			do{
				System.out.println("*********************************************************");
				System.out.println("��ѡ�������Ʒ��ţ�");
				System.out.println("1.T��\t2.����Ь\t3.������");
				System.out.println("*********************************************************");
				System.out.print("��������Ʒ��ţ�");
				a=input.nextInt();
				System.out.print("�����빺��������");
				num=input.nextInt();
				switch(a){
					case 1:
					name="T��";
					price=245.0;
					break;
					case 2:
					name="����Ь";
					break;
					case 3:
					name="������";
					break;
					default:
					System.out.println("��������ȷ������");
					break;	
				}
				sum=price*num;
				System.out.println(name+"��"+price+"\t������"+num+"\t�ϼƣ�"+sum);
				System.out.print("�Ƿ������y/n����");
				b=input.next();
			}while(b.equals("y"));
			System.out.println("�ۿۣ�0.8");
			System.out.println("Ӧ����"+(0.8*sum));
			System.out.print("ʵ����");
			mon=input.nextDouble();
			System.out.println("��Ǯ��"+(mon-0.8*sum));
			}
		}
	static int MyShopping(int n){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ��MyShoping����ϵͳ");
		System.out.println("*********************************************************");
		System.out.println("1.�ͻ���Ϣ����\n2.�������\n3.�������\n4.ע��");
		System.out.println("*********************************************************");
		System.out.println("��ѡ���������֣�");
		n=input.nextInt();
		while(n<1&&n>4){
			System.out.println("��������������������֣�");
			n=input.nextInt();
		}
		return n;
	}
}