/*��
	�̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���
*/

import java.util.*;

public class I{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		double count=0;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int a=input.nextInt();	
			if(a>30){
				count++;
			}
		}
		System.out.println("30�����µı����ǣ�"+(10-count)*10+"%");
		System.out.println("30�����ϵı����ǣ�"+count*10+"%");
	}
}