
import java.util.Scanner;
public class Administrator{
	String name;
	int passWord;
	public void show(){
		System.out.println("������"+name+"�����룺"+passWord);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Administrator admin1=new Administrator();
		Administrator admin2=new Administrator();
		admin1.name="admin1";
		admin2.name="admin2";
		admin1.passWord=111111;
		admin2.passWord=222222;
		admin1.show();
		admin2.show();
		System.out.print("�������û���");
		String a=sc.next();
		System.out.print("����������");
		int b=sc.nextInt();
		if(a.equals(admin1.name)&&b==admin1.passWord||a.equals(admin2.name)&&b==admin2.passWord){
			System.out.print("����yѡ���޸����룬��������ѡ���˳�");
			String choice=sc.next();
			if(choice.equals("y")){
				System.out.print("������������");
				int m=sc.nextInt();
				admin1.passWord=m;
				System.out.print("����ɹ������������Ϊ"+admin1.passWord);
			}
		}else{
			System.out.print("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ");
		}
	}

}
