/*���ʵ�ֽ����û����������������������Ľ׳ˡ�*/
import java.util.*;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=1;
		System.out.print("������һ��������");
		int num=input.nextInt();
		if(num>=1&&num<=10){
			for(int i=1;i<=num;i++){
				sum*=i;
			}
			System.out.println(num+"!="+sum);
		}else{
			System.out.println("�������Ӧ����1-10����!");
		}
	}
}