/*1.5�� ��ӡ 99 �˷����ȴ���� 1 �� ����� 1 �У�*/
public class Demo05{
	public static void main(String [] args){
		System.out.println("99 �˷���");
		System.out.println("");
		for(int i=9;i>=1;i--){
			for(int j=1;j<=9;j++){
				int count =i*j;
				System.out.print(i+"*"+j+"="+count+"\t");
				if(j==9){
					System.out.println("");
				}
			}
		}
	}	
}