/*1.5�� ��ӡ 99 �˷����ȴ���� 1 �� ����� 1 �У�*/
public class E{
	public static void main(String[] args){
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
				if(i==j){
					System.out.println();
				}
			}
		}
	}
}