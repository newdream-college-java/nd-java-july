/*��
	����һ������ n,ͳ�� 1 �� n ���ж��ٸ�������ż��
 */
import java.util.Scanner;

public class F{
	public static void main(String[ ] args){
		Scanner input=new Scanner(System.in);
		int countj=0,counto=0;
		int a=input.nextInt();
		for(int i=a;0<i;i--){
			if(i%2==0){
				counto++;
			}else{
				countj++;
			}
		}
		System.out.println("1 ��"+a+"����"+countj+"��������"+counto+"��ż��");
	}
}