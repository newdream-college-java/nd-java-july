/*
1.5�� ��ӡ 99 �˷����ȴ���� 1 �� ����� 1 �У�
*/

public class Work5{
	public static void main(String[] args){
		for(int i = 9;i>=1;i--){
			for(int j = 1;j<=i;j++){
				if(i==j){
				System.out.print(j+"x"+i+"="+i*j+"\n");		
				}else
					System.out.print(j+"x"+i+"="+i*j+"\t");
			}
		}
	}
}