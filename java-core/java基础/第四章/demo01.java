/*�������ع������ϵͳ*/
import java.util.Scanner;
public class demo01{
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		System.out.println("*-----------�������ع������ϵͳ-----------*");
		System.out.println("*----------------��½�˵���----------------*");
		System.out.println("*********************************************");
		System.out.println("\t\t1����½ϵͳ");
		System.out.println("\t\t2���˳�");
		System.out.println("�����루1-2��");
		System.out.println("*********************************************");
		int a1=input.nextInt();
		System.out.println("");
		if(a1==1){
			System.out.println("*********************************************");
			System.out.println("*-----------------���˵���-----------------*");
			System.out.println("*********************************************");
			System.out.println("\t\t1���ͻ���Ϣ����");
			System.out.println("\t\t2���������");
			System.out.println("\t\t3���������");
			System.out.println("\t\t4��ע��");
			System.out.println("�����루1-4��");
			System.out.println("*********************************************");
			int a2=input.nextInt();
			System.out.println("");
			switch(a2)
			{
				case 1:{
					System.out.println("*********************************************");
					System.out.println("*-------�������ϵͳ���ͻ���Ϣ����-------*");
					System.out.println("*********************************************");
					System.out.println("\t\t1����ʾ���пͻ���Ϣ");
					System.out.println("\t\t2����ӿͻ���Ϣ");
					System.out.println("\t\t3���޸Ŀͻ���Ϣ");
					System.out.println("\t\t4����ѯ�ͻ���Ϣ");
					System.out.println("�����루1-4��");
					System.out.println("*********************************************");
					System.out.println("");	
					break;
				}
				case 3:{
					System.out.println("*********************************************");
					System.out.println("*---------�������ϵͳ�����������---------*");
					System.out.println("*********************************************");
					System.out.println("\t\t1�����˴����");
					System.out.println("\t\t2�����˳齱");
					System.out.println("\t\t3�������ʺ�");
					System.out.println("�����루1-3��");
					System.out.println("*********************************************");
					System.out.println("");
					break;
				}default:{
					System.out.println("*********************************************");
					System.out.println("�����˳�");
				}
			}
		}else{
			System.out.println("*********************************************");
			System.out.println("�����˳�");
		}
	}
}