import java.util.Scanner;


public class E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������иߣ�");
		int a = input.nextInt();
		System.out.println("�������ӡ���ַ���");
		String b = input.next();
		E p = new E();
		p.printTriangle(a,b);
	}
	public void printTriangle(int row,String ch){
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
		System.out.print(ch);	
		}
		System.out.println();
		}
		
	}
}
