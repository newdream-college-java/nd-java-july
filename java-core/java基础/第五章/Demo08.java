/*
ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ�� 
����ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)����
�ۼӵ��ܽ�� 
������ n ʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ�������� 
����ϵͳ���˵�����ʾ�û��������֣�����ѡ�������Ӧģ�� 
�û����������Ҫ���ظ����룬ֱ��������ȷ��ִ����Ӧ���ܺ��˳�ѭ�� 
*/
import java.util.*;
public class Demo08{
	public static void main (String[] args){
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("��Ʒ���ƣ�\t1.T��\t\t2.����Ь\t3.������");	
		System.out.println("���ۣ�\t\t��245.0\t\t��280.0\t\t��220.0");
		System.out.println("***********************************************");	
		Scanner input = new Scanner(System.in);
		double sum=0;
		while(true){
			System.out.print("��������Ʒ��ţ�");
			int a = input.nextInt();
			while(a>3||a<1){
				System.out.print("�������������������Ʒ��ţ�");
				a = input.nextInt();
			}
			System.out.print("�����빺��������");
			int b = input.nextInt();
			switch(a){
				case 1:
				System.out.println("T��\t ��245.0\t����\t"+b+"\t�ϼƣ�\t"+245.0*b);
				sum=sum+245.0*b;
				break;
				case 2:
				System.out.println("����Ь\t ��280.0\t����\t"+b+"\t�ϼƣ�\t"+280.0*b);
				sum=sum+280.0*b;
				break;
				case 3:
				System.out.println("������\t ��220.0\t����\t"+b+"\t�ϼƣ�\t"+220.0*b);
				sum=sum+220.0*b;
				break;
				default:
				break;
			}
			System.out.print("�Ƿ������y/n��");
			String st = input.next();
			if(st.equals("n")){
				System.out.println("�ۿۣ�\t\t0.8");
				System.out.println("Ӧ����\t"+sum*0.8);
				System.out.print("ʵ����\t");
				double c = input.nextDouble();
				System.out.print("��Ǯ��\t"+(c-sum*0.8));
				System.exit(-1);
			}
			else if(st.equals("y")){
				System.out.println("�ɹ����빺�ﳵ");
			}
			else{
				System.out.println("���벻�Ϸ������������룺");
			}
			
			
		}
		
		
	}	
}