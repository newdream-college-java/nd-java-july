import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ա��(<4λ����>):");
		int a = input.nextInt();
		String aa = String.format("%4d",a).replace(" ","0");
		System.out.print("�������Ա����(��)");
		int m = input.nextInt();
		String mm = String.format("%2d",m).replace(" ","0");
		System.out.print("�������Ա����(��)");
		int d = input.nextInt();
		String dd = String.format("%2d",d).replace(" ","0");
		System.out.print("�������Ա����");
		int b = input.nextInt();
		System.out.println("��¼��Ļ�Ա��Ϣ��:");
		System.out.println(aa+"\t"+mm+"/"+dd+"\t"+b);
		if(a>9999 || a<1){
			System.out.println("��Ա��Ϣ����");
			return;
		}else if(m>12 || m<1){
			System.out.println("��Ա��Ϣ����");
			return;
		}		
	}
}