import java.util.Scanner;
public class pay{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("***************���ѵ�*****************");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t\t��245\t2\t��490");
		System.out.println("����Ь\t\t��570\t1\t��570");
		System.out.println("������\t\t��320\t1\tY320\n\n");
		System.out.println("�ۿۣ�\t\t8��");
		System.out.println("�����ܽ��\t��1104.0");
		System.out.print("ʵ�ʽɷ�\t��");
		int a=input.nextInt();
		double i=a-1104.0;
		System.out.println();
		System.out.println("��Ǯ\t��"+i);
		System.out.println("���ι�������Ļ�����:33");
		System.out.println("********************���ǻƽ�ָ���**********************");
		//8��(��ս��)����һ��С����Ȼ��������������ݺ�С������,��ʽ����С�� �������� С������
		System.out.println("�ڰ��⣺����һ��С����Ȼ��������������ݺ�С������");
		double decimal=input.nextDouble();
		int intDecimal=(int)decimal/1;
		double xdecimal=decimal-intDecimal;
		System.out.println("С��\t��������\tС������");
		System.out.println(decimal+"\t"+intDecimal+"\t\t"+xdecimal);
	}
}