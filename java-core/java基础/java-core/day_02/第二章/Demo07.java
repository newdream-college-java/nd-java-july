/*7������˵��
дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ
����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��)*/

public class Demo07{
	public static void main(String[] args){
		System.out.println("*************���ѵ�*************");
		double n=1500,a=245,b=570,c=320,s,z,x;
		s=(2*a+b+c)*0.8;
		z=n-s;
		x=(int)s/100*3;
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t��245\t2\t��490");
		System.out.println("����Ь\t��570\t1\t��570");
		System.out.println("������\t��320\t1\t��320");			
		System.out.println();
		System.out.println();
		System.out.println("�ۿۣ�\t8��");
		System.out.println("�����ܽ��\t��"+s);
		System.out.println("ʵ�ʽ���\t��"+n);
		System.out.println("��Ǯ\t��"+z);
		System.out.println("���ι�������Ļ����ǣ�"+x);	
	}
}