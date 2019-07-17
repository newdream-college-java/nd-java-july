import java.util.Scanner;
public class B{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û");
		String a = input.next();
		String sum="";
		while(!a.equals("Esc")){
		sum+=a;
		a = input.next();
		}
		System.out.print(sum);
		System.out.println("³ÌĞò½áÊø£¡");
		System.exit(-1);
}
}