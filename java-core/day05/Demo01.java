import java.util.Scanner;
import java.util.Random;
public class Demo01{
	public static void main(String[] args){
		//1.1��������� 100+101+102+����+200 ֮��
		int i=100;
		int sum=0;
		while(i<=200){
			sum+=i;
			i++;
			System.out.print(i+"+");
		}
		System.out.println("="+sum);
		//���� 1+1/4+1/9+....+1/(20*20)
		int ii=1;
		double onesum=0;
		while(ii<=20){
			onesum=onesum+1.0/ii*ii;
			System.out.print(1+"/"+ii*ii+"+");
			ii++;
			
		}
			System.out.print("="+onesum);
		//1.3�����ʹ�� while ѭ�������100��95��90��85������5��
		int one=100;
		while(one>=5){
			System.out.println(one);
			one-=5;
		}
		//1.4��ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�����������������ԭ���У�**�������ʵ�֡�
		Scanner input=new Scanner(System.in);
		System.out.println("wht you name?");
		String imput=input.next();
		while(imput.equals("��������")){
			System.out.println("���������룺");
			imput=input.next();
		};
			System.out.println("�������ԭ����"+imput);
		/*
		1.5��ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
		���������� 0 ��������������ʯͷ����
		���������� 1 �������������Ǽ�������
		���������� 2 �������������ǲ�����
		������������ͽ�������
		*/
		System.out.println("���ȭ����0=ʯͷ��1=������2=����");
		int a1=input.nextInt();
		switch(a1){
			case 0:
				System.out.println("��������ʯͷ");
				break;
			case 1:
				System.out.println("�������Ǽ���");
				break;
			case 2:
				System.out.println("�������ǲ�");
				break;
			default :
				System.out.println("���ɵ������ˣ�");
			System.exit(-1);
		}
		/*
		1.6�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ���*/
		System.out.println("���ȭ����0=ʯͷ��1=������2=����");
		int a;
		do{
			a=input.nextInt();
		switch(a){
			case 0:
				System.out.println("��������ʯͷ");
				break;
			case 1:
				System.out.println("�������Ǽ���");
				break;
			case 2:
				System.out.println("�������ǲ�");
				break;
			default :
				System.out.println("���ɵ������ˣ�");
		}
		}while(a>2||a<0);
		Random random=new Random();
		int data=random.nextInt(3);
		switch(data){
			case 0:
			System.out.println("���������ʯͷ");
			break;
			case 1:
			System.out.println("��������Ǽ���");
			break;
			case 2:
			System.out.println("����������ǲ�");
			break;
		}
		if(a==0&&data==1||a==1&&data==2||a==2&&data==0){
			System.out.print("��Ӯ��");
		}else if(a==data){
			System.out.println("ƽ��");
		}else{
			System.out.println("������");
		}
	}
}