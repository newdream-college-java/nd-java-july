/*1.5�� ��ӡ 99 �˷����ȴ���� 1 �� ����� 1 �У�*/
public class Work05{
	public static void main(String [] args){
		for(int i=9;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}