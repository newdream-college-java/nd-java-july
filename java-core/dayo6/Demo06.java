import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String username;
		int password;
		for(int i=3;i>0;i--){
			System.out.print("�������û���:");
			username=input.next();
			System.out.print("����������");
			password=input.nextInt();
			if(username.equals("jim")&&password==123456){
				System.out.println("��ӭ��½MyShoppingϵͳ");
				break;
			}else if(i==1){
				System.out.println("�Բ�����3�����������");
			}else{
				System.out.println("��������㻹��"+(i-1)+"�λ��ᣡ");
			}
		}
	}
}