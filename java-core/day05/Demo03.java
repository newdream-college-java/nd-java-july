import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("\t\t��ӭʹ�ó����󼸰ѹ������ϵͳ");


 
			System.out.println("************************************************************");


 
			System.out.println("\t\t\t1.�ͻ���Ϣ����");


 
			System.out.println("\t\t\t2.�������");


 
			System.out.println("\t\t\t3.�������");


 
			System.out.println("\t\t\t4.ע��");


 
			System.out.println("************************************************************");


 
			System.out.println("��ѡ�����������֣�");
			int score;
			score=input.nextInt();
			while(score>3||score<1){
				System.out.println("��ѡ�����������֣�");
				score=input.nextInt();
			}
			
			switch(score){
				case 1:
				break;
				case 2:
			
		//ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ��
		System.out.println("MyShopping����ϵͳ\t>\t�������\n");
		System.out.println("****************************************************\n");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("****************************************************\n");
		
		int data;
		double sum=0;
		String b="";
		do{
		do{
			System.out.print("��������Ʒ��ţ�");
			if(!input.hasNextInt()){
				System.out.println("ֻ���������ֶ���");
				System.exit(-1);
			}
			data=input.nextInt();
			System.out.print("��������Ʒ������");
			int sub=input.nextInt();
			switch(data){
				case 1:
					sum=sub*245.0;
					System.out.println("T��\t��"+sum);
					break;
				case 2:
					sum=sub*550.0;
					System.out.println("����Ь\t��"+sum);
					break;
				case 3:
					sum=sub*680.0;
					System.out.println("������\t��"+sum);
					break;
				default:
					System.out.println("����������������������");
			}
		}while(data>3||data<1);
		
			System.out.println("�Ƿ����(y/n)");
			b=input.next();
			if(!b.equals("y") && !b.equals("n")){
				System.out.println("�������������������룺");
			}
			if(b.equals("n")){
				System.out.println("�������");
			}
		}while(b.equals("y") && !b.equals("n"));
		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����"+sum);
		System.out.print("ʵ����");
		double iop=input.nextDouble();
		System.out.println("��Ǯ��"+(iop-sum));
		break;
		case 3:
			break;
		case 4:
			break;
		}
	}
}