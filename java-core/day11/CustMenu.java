import java.util.Scanner;

/**ʵ����ʾ��������˵�
 * 
 * @author Ф��
 *
 */
public class CustMenu {
	public void showCustMenu(){
		System.out.println("\t�������ع������ϵͳ>�������");
		System.out.println("****************************");
		System.out.println("\t1.���˴����");
		System.out.println("\t2.���˳齱");
		System.out.println("\t3.�����ʺ�");
		System.out.println("****************************");
		System.out.println("�����ӣ���������0������һ���˵�");
		Scanner input=new Scanner(System.in);
		int data=input.nextInt();
		if(data==1){
			System.out.println("ִ�����˴����");
		}else if(data==2){
			System.out.println("ִ�����˳齱");
		}else if(data==3){
		System.out.println("ִ�������ʺ�");
		}else if(data==0){
			MainMenu s=new MainMenu();
			s.showMainMenu();
		}else{
			System.exit(0);
		}
	}
}
