/*
1.5�� ��ӡ 99 �˷����ȴ���� 1 �� ����� 1 �У�
*/
public class Demo05{
	public static void main(String[] args){
		//iΪ��һ��������jΪ�ڶ�������
		for(int i = 9;i>=1;i--){
			for(int j = 1;j<=i;j++){
				//������������ͬʱ����
				if(j!=i){
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				else{
					System.out.println(i+"*"+j+"="+i*j+"\t");
				}
			
			}
		}
	}
}