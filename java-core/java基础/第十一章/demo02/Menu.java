/*ʵ��ϵͳ�˵�������˵���ţ����������л������˵�*/
package demo02;
/**
 * @ClassName:DocClass
 * @Description:�����ĵ�ע���õ���
 * @author Ԭ��
 * @date 2019��7��23��
 */
import java.util.*;
public class Menu {
	Scanner input=new Scanner(System.in);
	Manager gk=new Manager();
	StartSMS ms=new StartSMS();
	/**
	 * ��½����ķ���
	 */
	//��½����
	public void showLoginMenu() {
		System.out.println();
		System.out.println();
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1.��½ϵͳ");
		System.out.println("2.�˳�");
		System.out.println("**************************************");
		System.out.print("��ѡ���������֣�");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			ms.check(gk);
			break;
		case 2:
			System.out.println("�������˳���");
			break;
		}
	}
	/**
	 * ���˵��ķ���
	 */
	//���˵�
	public void showMainMenu() {
		System.out.println();
		System.out.println();
		System.out.println("�������ع������ϵͳ���˵�");
		System.out.println("**************************************");
		System.out.println("1.�ͻ���Ϣ����");
		System.out.println("2.�������");
		System.out.println("**************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			showCustMenu();
			break;
		case 2:
			showSendGMenu();
			break;
		case 0:
			showLoginMenu();
			break;
		}
	}
	/**
	 * �ͻ���Ϣ����ķ���
	 */
	//�ͻ���Ϣ����
	public void showCustMenu() {
		System.out.println();
		System.out.println();
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����");
		System.out.println("**************************************");
		System.out.println("1.��ѯ�ͻ���Ϣ");
		System.out.println("2.�޸Ŀͻ���Ϣ");
		System.out.println("3.��ӿͻ���Ϣ");
		System.out.println("4.��ʾ���пͻ���Ϣ");
		System.out.println("**************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			System.out.println("ִ�в�ѯ�ͻ���Ϣ");
			break;
		case 2:
			System.out.println("ִ���޸Ŀͻ���Ϣ");
			break;
		case 3:
			System.out.println("ִ����ӿͻ���Ϣ");
			break;
		case 4:
			System.out.println("ִ����ʾ���пͻ���Ϣ");
			break;
		case 0:
			showMainMenu();
			break;
		}
	}
	/**
	 * ��������ķ���
	 */
	//�������
	public void showSendGMenu() {
		System.out.println();
		System.out.println();
		System.out.println("�������ع������ϵͳ>�������");
		System.out.println("**************************************");
		System.out.println("1.���˴����");
		System.out.println("2.���˳齱");
		System.out.println("3.�����ʺ�");
		System.out.println("**************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			System.out.println("ִ�����˴����");
			break;
		case 2:
			System.out.println("ִ�����˳齱");
			break;
		case 3:
			System.out.println("ִ�������ʺ�");
			break;
		case 0:
			showMainMenu();
			break;
		}
	}
}
