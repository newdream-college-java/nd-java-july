import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		/*1.6������һ������ nͳ�� 1 �� n ���ж��ٸ�������ż��*/
		Scanner input=new Scanner(System.in);
		int data=input.nextInt();
		int even=0,odd=0;
		for(int i=1;i<=data;i++){
			if(i%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("������:"+odd+"\tż���У�"+even);
	}
}