import java.util.Scanner;
public class D{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���������֣�");
		int a = input.nextInt();
		int f =0;
		int z = 0;
		int l = 0;
		while(a!=999){
		if(a<0){
		f++;
		}else if(a==0){
		l++;
		}else {
		z++;
		a=input.nextInt();
		}
		}
		System.out.println("��������Ϊ��"+z);
		System.out.println("��������Ϊ��"+f);
		System.out.println("0�ĸ���Ϊ��"+l);
		System.exit(-1);
	}
}