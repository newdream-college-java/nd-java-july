import java.util.*;
public class G{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������֣�");
		int a = input.nextInt();
		int sum=0;
		while(a>0){
		sum+=a;
		a=input.nextInt();
		if(a==0){
			System.out.println("��������");
		break;
		}
	}
		
		System.out.println("�ۼӵĺ�Ϊ"+sum);
}
}