import java.util.Scanner;
public class B{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ַ�");
		String a = input.next();
		String sum="";
		while(!a.equals("Esc")){
		sum+=a;
		a = input.next();
		}
		System.out.print(sum);
		System.out.println("���������");
		System.exit(-1);
}
}