import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		//2.6�����ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ���������������������
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ����");
		double onedata=input.nextDouble();
		System.out.println("������Ҫ��������+��-��*��/");
		String twodata=input.next();
		System.out.println("������ڶ�����");
		double threedata=input.nextDouble();
		double sum;
		switch (twodata){
			case "+":
			sum=onedata+threedata;
			System.out.println(onedata+"+"+threedata+"="+sum);
			break;
			case "-":
			sum=onedata-threedata;
			System.out.println(onedata+"-"+threedata+"="+sum);
			break;
			case "*":
			sum=onedata*threedata;
			System.out.println(onedata+"*"+threedata+"="+sum);
			break;
			case "/":
			sum=onedata/threedata;
			System.out.println(onedata+"/"+threedata+"="+sum);
			break;
			default:
			System.out.println("ֻ����+��-��*��/����");
		}
	}
}