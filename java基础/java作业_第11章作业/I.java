import java.util.Scanner;


public class I {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I b = new I();
		b.year();
	}
	public void year(){
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int a = input.nextInt();
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.println(a+"������");
		}else {
			System.out.println(a+"��ƽ��");
		}
	}
}
